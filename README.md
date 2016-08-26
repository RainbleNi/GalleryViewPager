# GalleryViewPager
One ViewPager who can implement the effect of Gallery.

[![](https://www.jitpack.io/v/RainbleNi/GalleryViewPager.svg)](https://www.jitpack.io/#RainbleNi/GalleryViewPager)

演示视频地址(Demon Video) http://v.youku.com/v_show/id_XMTY5Nzc2NzY0MA==.html

##Usage
Is almost same as ViewPager from support.v4.
You should change the page width in PagerAdapter
```java
galleryViewPager.setAdapter(new PagerAdapter() {
     some same as support.v4.view.ViewPager
     .....
  @Override public float getPageWidth(int position) { 
    return 0.8f;//suggest value from 0.6 to 0.85
    }
}
```
If you need the side page is smaller than the center page, you should set the ratio of the side page to center page.
```java
galleryViewPager.setNarrowFactor(0.9f);//suggest value from 0.7 to 0.95
```

CycleGalleryViewPager is a GalleryViewPager which can cycle sliding. Usage please see https://github.com/RainbleNi/CycleViewPager
