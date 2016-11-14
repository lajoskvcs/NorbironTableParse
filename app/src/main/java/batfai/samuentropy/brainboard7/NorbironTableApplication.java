package batfai.samuentropy.brainboard7;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseFacebookUtils;

/**
 * Created by diwin on 2016. 11. 14..
 */

public class NorbironTableApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(NorbironTableApplication.this)
                .applicationId("NorbironTable")
                .clientKey("Norbiron")
                .server("http://10.0.2.2:1337/parse")
                .build()
        );
        ParseFacebookUtils.initialize(NorbironTableApplication.this);
    }
}
