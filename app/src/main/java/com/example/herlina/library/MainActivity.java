package com.example.herlina.library;

import android.graphics.Bitmap;
import android.app.AlertDialog;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =(Button)findViewById(R.id.Btn_proses);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = (ImageView)findViewById(R.id.img_Gambar);
                BitmapFactory.Options options =new BitmapFactory.Options();
                options.inMutable=true;
                Bitmap myBitmap =BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.test1,options);

//                FaceDetector faceDetector =
//                        new FaceDetector.Builder(getApplicationContext()).setTrackingEnabled(false).build();
//
//                if(!faceDetector.isOperational()){
//                    new AlertDialog.Builder(view.getContext()).setMessage("Gakbisa mroses face" +"detector!").show();
//                    return;
//                }
//                Frame frame= new Frame.Builder().setBitmap(myBitmap).build();
//                SparseArray<Face> faces =faceDetector.detect(frame);
//
//
//
//                Paint myRectPaint = new Paint();
//                myRectPaint.setStrokeWidth(10);
//                myRectPaint.setColor(Color.RED);
//                myRectPaint.setStyle(Paint.Style.STROKE);
//
                Emojifier emotik = new Emojifier();
               Bitmap tempBitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.test1,options);
//                Canvas tempCanvas = new Canvas(tempBitmap);
//                tempCanvas.drawBitmap(myBitmap,0,0,null);
//
//                for (int i=0; i<faces.size(); i++){
//                    Face thisFace =faces.valueAt(i);
//                    float x1 = thisFace.getPosition().x;
//                    float y1 = thisFace.getPosition().y;
//                    float x2 =x1 + thisFace.getWidth();
//                    float y2 =y1 + thisFace.getHeight();
//                    tempCanvas.drawRoundRect(new RectF(x1,y1,x2,y2),2,2,myRectPaint);
//                }
//                image.setImageDrawable(new BitmapDrawable(getResources(),tempBitmap));
                image.setImageBitmap(emotik.detectFaces(getApplicationContext(),tempBitmap));

            }

        });

    }

}
