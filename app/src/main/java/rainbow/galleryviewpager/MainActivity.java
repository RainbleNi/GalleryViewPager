package rainbow.galleryviewpager;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (getFragmentManager().findFragmentByTag(MainFragment.class.getName()) == null) {
      getFragmentManager().beginTransaction()
          .add(R.id.container, Fragment.instantiate(this, MainFragment.class.getName()),
              MainFragment.class.getName())
          .commit();
    }
  }
}
