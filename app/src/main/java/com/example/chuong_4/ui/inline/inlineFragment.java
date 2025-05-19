package com.example.chuong_4.ui.inline;

import android.os.Bundle;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.chuong_4.databinding.FragmentInlineBinding;

public class inlineFragment extends Fragment {
    private FragmentInlineBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentInlineBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // 1️⃣ Xử lý sự kiện Click
        binding.btnClick.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Bạn đã nhấn nút Click!", Toast.LENGTH_SHORT).show();
        });

        // 2️⃣ Xử lý sự kiện Long Click
        binding.btnLongClick.setOnLongClickListener(v -> {
            Toast.makeText(getActivity(), "Bạn đã nhấn giữ nút!", Toast.LENGTH_SHORT).show();
            return true;
        });

        // 3️⃣ Xử lý sự kiện Touch (Chạm, vuốt, kéo)
        binding.btnTouch.setOnTouchListener((v, event) -> {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(getActivity(), "Chạm vào nút!", Toast.LENGTH_SHORT).show();
            }
            return true;
        });

        // 4️⃣ Xử lý sự kiện Focus Change (Khi EditText nhận hoặc mất focus)
        binding.editText.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                Toast.makeText(getActivity(), "EditText đã nhận focus!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getActivity(), "EditText đã mất focus!", Toast.LENGTH_SHORT).show();
            }
        });

        // 5️⃣ Xử lý sự kiện Key (Nhấn phím trên bàn phím)
        binding.editText.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                Toast.makeText(getActivity(), "Bạn đã nhấn ENTER!", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        });

        // 6️⃣ Xử lý sự kiện Drag (Kéo thả View)
        binding.btnDrag.setOnDragListener((v, event) -> {
            if (event.getAction() == DragEvent.ACTION_DRAG_STARTED) {
                Toast.makeText(getActivity(), "Bắt đầu kéo!", Toast.LENGTH_SHORT).show();
            }
            return true;
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}