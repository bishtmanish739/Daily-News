package in.technicalkeeda.dailynews.ui.NationalNews;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.technicalkeeda.dailynews.R;

public class nationalnews extends Fragment {

    private NationalnewsViewModel mViewModel;

    public static nationalnews newInstance() {
        return new nationalnews();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.nationalnews_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(NationalnewsViewModel.class);
        // TODO: Use the ViewModel
    }

}
