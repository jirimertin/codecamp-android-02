package cz.codecamp.android.first;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class Main2ActivityFragment extends Fragment {

    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main2, container, false);
    }

    @Override
    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Ziskame tlacitko z designu a nastavime mu akci
        Button hitMe = (Button) view.findViewById(R.id.hitMeButton);
        hitMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                // Tlacitko bylo stisknuto, rekni to activite
                ((Main2Activity)getActivity()).hit();
            }
        });
    }
}
