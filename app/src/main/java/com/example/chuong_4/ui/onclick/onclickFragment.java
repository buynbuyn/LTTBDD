package com.example.chuong_4.ui.onclick;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.chuong_4.databinding.FragmentOnclickBinding;

public class onclickFragment extends Fragment {
    private FragmentOnclickBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        onclickViewModel onclickViewModel =
                new ViewModelProvider(this).get(onclickViewModel.class);

        binding = FragmentOnclickBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        binding.btn.setOnClickListener(v -> {
            Intent intent = new Intent(requireContext(), OnclickActivity.class);
            startActivity(intent);
        });

        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
