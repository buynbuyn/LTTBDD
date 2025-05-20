package com.example.chuong_4.ui.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.chuong_4.databinding.FragmentActivityBinding;

public class activityFragment  extends Fragment {
    private FragmentActivityBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        activityViewModel activityViewModel =
                new ViewModelProvider(this).get(activityViewModel.class);

        // Inflate the layout with view binding
        binding = FragmentActivityBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Set up click listener for btn_listener using view binding
        binding.btnListener.setOnClickListener(v ->
                Toast.makeText(requireContext(), "Sử dụng Activity bắt sự kiện với Listener", Toast.LENGTH_SHORT).show());

        // Set up click listener for btn_interface using view binding
        binding.btnInterface.setOnClickListener(this::onClick);

        return root;
    }

    // Method for XML-defined button click (e.g., android:onClick="onButtonClick")
    public void onButtonClick(View view) {
        Toast.makeText(requireContext(), "Nút được nhấn từ XML!", Toast.LENGTH_SHORT).show();
    }

    // Handle configuration changes (if needed in Fragment)
    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(requireContext(), "Màn hình ngang", Toast.LENGTH_SHORT).show();
        }
    }

    // Click listener for btn_interface
    private void onClick(View v) {
        Toast.makeText(requireContext(), "Nút được nhấn!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}