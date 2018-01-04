package com.ventoray.jokepresentation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

//import butterknife.BindView;
//import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class JokeFragment extends Fragment {

//    @BindView(R2.id.tv_joke) TextView jokeTextView;
    private TextView jokeTextView;

    public static final String KEY_JOKE_STRING = "keyJokeString";

    public JokeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle args = getArguments();
        String joke = getString(R.string.error_no_joke);

        if (args != null && args.containsKey(KEY_JOKE_STRING)) {
            joke = args.getString(KEY_JOKE_STRING);
        }

        View view = inflater.inflate(R.layout.fragment_joke, container, false);
//        ButterKnife.bind(this, view);
        jokeTextView = (TextView) view.findViewById(R.id.tv_joke);
        jokeTextView.setText(joke);

        return view;
    }

}
