package xtem.com.demoopengl;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by admin on 08/05/15.
 */
public class MyGLSurfaceView extends GLSurfaceView{

    public MyGLSurfaceView(Context context){
        super(context);
        setEGLContextClientVersion(2);
        MyGLRenderer myGLRenderer = new MyGLRenderer();
        setRenderer(myGLRenderer);
    }
}
