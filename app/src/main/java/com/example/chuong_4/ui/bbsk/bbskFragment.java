package com.example.chuong_4.ui.bbsk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.chuong_4.R;
import com.example.chuong_4.databinding.FragmentBbskBinding;

public class bbskFragment extends Fragment {
    private FragmentBbskBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bbskViewModel bbskViewModel =
                new ViewModelProvider(this).get(bbskViewModel.class);


        // Inflate the layout
        binding = FragmentBbskBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Set up click listeners
        binding.btnViewBinding1.setOnClickListener(clickListener);
        binding.btnViewBinding2.setOnClickListener(clickListener);

        // Set listener for btn_listener
        binding.btnListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(requireContext(), "Sử dụng biến bắt sự kiện với Listener", Toast.LENGTH_SHORT).show();
            }
        });

        // Set listeners for multiple buttons
        binding.btnListenerAll1.setOnClickListener(listenerAll);
        binding.btnListenerAll2.setOnClickListener(listenerAll);
        binding.btnListenerAll3.setOnClickListener(listenerAll);

        // Set listener for btn_phuongthuc
        binding.btnPhuongthuc.setOnClickListener(phuongthuc);

        return root;
    }

    private final View.OnClickListener listenerAll = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            if (id == R.id.btn_listenerAll1) {
                Toast.makeText(requireContext(), "Sử dụng biến bắt sự kiện với Listener với Button 1", Toast.LENGTH_SHORT).show();
            } else if (id == R.id.btn_listenerAll2) {
                Toast.makeText(requireContext(), "Sử dụng biến bắt sự kiện với Listener với Button 2", Toast.LENGTH_SHORT).show();
            } else if (id == R.id.btn_listenerAll3) {
                Toast.makeText(requireContext(), "Sử dụng biến bắt sự kiện với Listener với Button 3", Toast.LENGTH_SHORT).show();
            }
        }
    };

    private final View.OnClickListener phuongthuc = this::handleButtonClick;

    private void handleButtonClick(View view) {
        Toast.makeText(requireContext(), "Sử dụng biến bắt sự kiện với phương thức", Toast.LENGTH_SHORT).show();
    }

    private final View.OnClickListener clickListener = v ->
            Toast.makeText(requireContext(), "Sử dụng biến bắt sự kiện với view binding", Toast.LENGTH_SHORT).show();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}