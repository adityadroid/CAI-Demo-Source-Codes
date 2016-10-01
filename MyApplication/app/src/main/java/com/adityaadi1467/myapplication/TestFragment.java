package com.adityaadi1467.myapplication;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;


public class TestFragment extends DialogFragment {

    public static TestFragment newInstance(int identifier) {
        TestFragment testFragment = new TestFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("id", identifier);
        testFragment.setArguments(bundle);
        return testFragment;
    }

    public TestFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_test, container, false);
        TextView identifier = (TextView) inflate.findViewById(R.id.identifier);
        identifier.setText(String.valueOf(getArguments().getInt("id")));
        WebView wb= (WebView)inflate.findViewById(R.id.web);

wb.setWebViewClient(new webclient());

        wb.loadUrl("http://m.facebook.com");

        return inflate;
    }
    public class webclient extends WebViewClient
    {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return super.shouldOverrideUrlLoading(view, url);
        }
    }



}
