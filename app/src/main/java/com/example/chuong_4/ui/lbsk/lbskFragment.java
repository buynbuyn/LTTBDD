package com.example.chuong_4.ui.lbsk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.chuong_4.R;
import com.example.chuong_4.databinding.FragmentLbskBinding;

public class lbskFragment extends Fragment {
    private FragmentLbskBinding binding;
    private lbskViewModel viewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Khởi tạo ViewModel
        viewModel = new ViewModelProvider(this).get(lbskViewModel.class);

        // Inflate layout với View Binding
        binding = FragmentLbskBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Gắn lớp bắt sự kiện tường minh
        binding.btnShowToast.setOnClickListener(new MyEvent());
        binding.btnChangeText.setOnClickListener(new MyEvent());
        binding.btnReset.setOnClickListener(new MyEvent());

        // Quan sát dữ liệu từ ViewModel
        viewModel.getText().observe(getViewLifecycleOwner(), text -> {
            binding.tvMessage.setText(text);
        });

        return root;
    }

    // Lớp bắt sự kiện tường minh
    private class MyEvent implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            if (id == R.id.btnShowToast) {
                Toast.makeText(v.getContext(), "Toast Button clicked!", Toast.LENGTH_SHORT).show();
            } else if (id == R.id.btnChangeText) {
                viewModel.setText("Text changed by Button!");
            } else if (id == R.id.btnReset) {
                viewModel.setText("Welcome to lbsk Fragment!");
            }
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}