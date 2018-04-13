package com.example.thuanhuynh.giuaky_game;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ChessBoard chessBoard;
    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        imageView = findViewById(R.id.imgView);
        chessBoard = new ChessBoard(MainActivity.this, 1000, 1000, 8, 8);
        chessBoard.init();
        bitmap = chessBoard.drawBoard();
        imageView.setImageBitmap(bitmap);
    }
}
