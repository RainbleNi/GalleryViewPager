package rainbow.galleryviewpager;

import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import rainbow.library.GalleryViewPager;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.8f);
    GalleryViewPager viewPager = (GalleryViewPager) findViewById(R.id.viewpager);
    viewPager.setAdapter(new PagerAdapter() {
      @Override public int getCount() {
        return 4;
      }

      @Override public boolean isViewFromObject(View view, Object object) {
        return view == (View) object;
      }

      @Override public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(MainActivity.this);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        container.addView(imageView);
        imageView.setImageResource(R.drawable.picture);
        return imageView;
      }

      @Override public float getPageWidth(int position) {
        return 0.8f;
      }

      @Override public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
      }
    });
  }
}
