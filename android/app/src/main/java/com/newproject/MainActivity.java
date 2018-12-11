package com.newproject;
import android.content.Intent;
import com.facebook.react.ReactActivity;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */

    @Override
    protected String getMainComponentName() {
        return "newproject";
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    MainApplication.getCallbackManager().onActivityResult(requestCode, resultCode, data);
    }
    public void logSentFriendRequestEvent () {
    // logger.logEvent("sentFriendRequest");
    AppEventsLogger.activateApp(getApplication());
    }
}
