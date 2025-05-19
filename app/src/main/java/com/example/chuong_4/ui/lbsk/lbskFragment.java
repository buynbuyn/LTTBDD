package com.example.chuong_4.ui.lbsk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.chuong_4.databinding.FragmentLbskBinding;

public class lbskFragment extends Fragment {
    private FragmentLbskBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        lbskViewModel lbskViewModel =
                new ViewModelProvider(this).get(lbskViewModel.class);

        binding = FragmentLbskBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
