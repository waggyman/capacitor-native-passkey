package com.awebr000.webauthn;

import android.util.Log;
import androidx.credentials.CredentialManager;

public class WebAuthn {
    private CredentialManager credentialManager;

    public void setCredentialManager(CredentialManager credentialManager) {
        Log.i("setCredentialManager", String.valueOf(credentialManager));
        this.credentialManager=credentialManager;
    }

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public boolean isWebAuthnAvailable() {
        return isAvailable(WebAuthnTypes.WEBAUTHN);
    }
    public boolean isWebAuthnAutoFillAvailable() {
        return isAvailable(WebAuthnTypes.WEBAUTHNAUTOFILL);
    }

    private boolean isAvailable(WebAuthnTypes webAuthnType) {
        boolean val = false;
        switch(webAuthnType) {
            case WEBAUTHN:
                val = false;
                break;
            case WEBAUTHNAUTOFILL:
                val=false;
                break;
        }
        return val;
    }

  public CredentialManager getCredentialManager() {
      return this.credentialManager;
  }
}
