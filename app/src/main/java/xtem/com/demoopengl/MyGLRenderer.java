package xtem.com.demoopengl;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by admin on 08/05/15.
 */
public class MyGLRenderer implements GLSurfaceView.Renderer{

    public void onSurfaceCreated(GL10 unused, EGLConfig config){
        //set the background frame color
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
    }

    public void onDrawFrame(GL10 unused){
        //redraw background color
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
    }

    public void onSurfaceChanged(GL10 unused, int width, int height){
        GLES20.glViewport(0, 0, width, height);
    }
}
