package rainbow.galleryviewpager;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Nirui on 16/8/12.
 */
public class MainFragment extends Fragment implements View.OnClickListener{

  @Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View root = inflater.inflate(R.layout.main_fragment, container, false);
    Button button1 = (Button) root.findViewById(R.id.button1);
    button1.setOnClickListener(this);
    Button button2 = (Button) root.findViewById(R.id.button2);
    button2.setOnClickListener(this);
    return root;
  }

  @Override public void onClick(View v) {
    switch (v.getId()) {
      case R.id.button1:
        getFragmentManager().beginTransaction()
            .replace(R.id.container,
                Fragment.instantiate(getActivity(), GalleryFragment.class.getName()))
            .addToBackStack(null)
            .commit();
        break;
      case R.id.button2:
        getFragmentManager().beginTransaction()
            .replace(R.id.container,
                Fragment.instantiate(getActivity(), CycleGalleryFragment.class.getName()))
            .addToBackStack(null)
            .commit();
        break;
    }

  }
}
