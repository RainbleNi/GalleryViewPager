# GalleryViewPager
One ViewPager who can implement the effect of Gallery.

[![](https://www.jitpack.io/v/RainbleNi/GalleryViewPager.svg)](https://www.jitpack.io/#RainbleNi/GalleryViewPager)

##Usage
Is almost same as ViewPager from support.v4.
You should change the page width in PagerAdapter
```java
galleryViewPager.setAdapter(new PagerAdapter() {
     some same as support.v4.view.ViewPager
     .....
  @Override public float getPageWidth(int position) { 
    return 0.8f;//suggest value from 0.6 to 1.0
    }
}
```
If you need the side page is smaller than the center page, you should set the ratio of the side page to center page.
```java
galleryViewPager.setNarrowFactor(0.9f);
```
