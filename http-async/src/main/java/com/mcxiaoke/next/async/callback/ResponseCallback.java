package com.mcxiaoke.next.async.callback;

import com.mcxiaoke.next.http.NextResponse;

/**
 * User: mcxiaoke
 * Date: 15/8/21
 * Time: 10:51
 */
public abstract class ResponseCallback implements HttpCallback<NextResponse> {
    @Override
    public void onSuccess(final NextResponse response) {

    }

    @Override
    public void onError(final Throwable error) {

    }
}
