package com.mcxiaoke.next.async;

import com.mcxiaoke.next.async.callback.FileCallback;
import com.mcxiaoke.next.async.callback.GsonCallback;
import com.mcxiaoke.next.async.callback.ResponseCallback;
import com.mcxiaoke.next.async.callback.StringCallback;
import com.mcxiaoke.next.http.HttpMethod;
import com.mcxiaoke.next.http.NextParams;
import com.mcxiaoke.next.http.NextRequest;

import java.io.File;
import java.util.Collections;
import java.util.Map;

/**
 * User: mcxiaoke
 * Date: 16/1/11
 * Time: 11:47
 */
public class HttpCalls {
    private HttpCalls() {
        throw new RuntimeException("Can't create new instance");
    }

    private synchronized static HttpQueue getHttpQueue() {
        return HttpQueue.getDefault();
    }

    private static Map<String, String> emptyMap() {
        return Collections.emptyMap();
    }

    public static String head(final String url, final ResponseCallback callback,
                              Object caller) {
        return head(url, emptyMap(), callback, caller);
    }

    public static String head(final String url, final Map<String, String> queries,
                              final ResponseCallback callback,
                              Object caller) {
        return addRequest(HttpMethod.HEAD, url, queries, null, callback, caller);
    }

    public static String head(final String url, final NextParams params,
                              final ResponseCallback callback,
                              Object caller) {
        return addRequest(HttpMethod.HEAD, url, params, callback, caller);
    }

    public static String get(final String url, final ResponseCallback callback,
                             Object caller) {
        return get(url, emptyMap(), callback, caller);
    }

    public static String get(final String url, final Map<String, String> queries,
                             final ResponseCallback callback,
                             Object caller) {
        return addRequest(HttpMethod.GET, url, queries, null, callback, caller);
    }

    public static String get(final String url, final NextParams params,
                             final ResponseCallback callback,
                             Object caller) {
        return addRequest(HttpMethod.GET, url, params, callback, caller);
    }

    public static String get(final String url, final StringCallback callback,
                             Object caller) {
        return get(url, emptyMap(), callback, caller);
    }

    public static String get(final String url, final Map<String, String> queries,
                             final StringCallback callback,
                             Object caller) {
        return addRequest(HttpMethod.GET, url, queries, null, callback, caller);
    }

    public static String get(final String url, final NextParams params,
                             final StringCallback callback,
                             Object caller) {
        return addRequest(HttpMethod.GET, url, params, callback, caller);
    }

    public <T> String get(final String url,
                          final GsonCallback<T> callback,
                          Object caller) {
        return get(url, emptyMap(), callback, caller);
    }

    public static <T> String get(final String url, final Map<String, String> queries,
                                 final GsonCallback<T> callback,
                                 Object caller) {
        return addRequest(HttpMethod.GET, url, queries, null, callback, caller);
    }

    public static <T> String get(final String url, final NextParams params,
                                 final GsonCallback<T> callback,
                                 Object caller) {
        return addRequest(HttpMethod.GET, url, params, callback, caller);
    }

    public static String delete(final String url, final ResponseCallback callback,
                                Object caller) {
        return delete(url, emptyMap(), callback, caller);
    }

    public static String delete(final String url, final Map<String, String> queries,
                                final ResponseCallback callback,
                                Object caller) {
        return addRequest(HttpMethod.DELETE, url, queries, null, callback, caller);
    }

    public static String delete(final String url, final NextParams params,
                                final ResponseCallback callback,
                                Object caller) {
        return addRequest(HttpMethod.DELETE, url, params, callback, caller);
    }

    public static String delete(final String url, final StringCallback callback,
                                Object caller) {
        return delete(url, emptyMap(), callback, caller);
    }

    public static String delete(final String url, final Map<String, String> queries,
                                final StringCallback callback,
                                Object caller) {
        return addRequest(HttpMethod.DELETE, url, queries, null, callback, caller);
    }

    public static String delete(final String url, final NextParams params,
                                final StringCallback callback,
                                Object caller) {
        return addRequest(HttpMethod.DELETE, url, params, callback, caller);
    }


    public static <T> String delete(final String url,
                                    final GsonCallback<T> callback,
                                    Object caller) {
        return delete(url, emptyMap(), callback, caller);
    }

    public static <T> String delete(final String url,
                                    final Map<String, String> queries,
                                    final GsonCallback<T> callback,
                                    Object caller) {
        return addRequest(HttpMethod.DELETE, url, queries, null, callback, caller);
    }

    public static <T> String delete(final String url,
                                    final NextParams params,
                                    final GsonCallback<T> callback,
                                    Object caller) {
        return addRequest(HttpMethod.DELETE, url, params, callback, caller);
    }

    public static String post(final String url,
                              final ResponseCallback callback,
                              Object caller) {
        return post(url, emptyMap(), callback, caller);
    }

    public static String post(final String url,
                              final Map<String, String> forms,
                              final ResponseCallback callback,
                              Object caller) {
        return addRequest(HttpMethod.POST, url, null, forms, callback, caller);
    }

    public static String post(final String url, final NextParams params,
                              final StringCallback callback,
                              Object caller) {
        return addRequest(HttpMethod.POST, url, params, callback, caller);
    }

    public static String post(final String url,
                              final StringCallback callback,
                              Object caller) {
        return post(url, emptyMap(), callback, caller);
    }

    public static String post(final String url,
                              final Map<String, String> forms,
                              final StringCallback callback,
                              Object caller) {
        return addRequest(HttpMethod.POST, url, null, forms, callback, caller);
    }

    public static String post(final String url, final NextParams params,
                              final ResponseCallback callback,
                              Object caller) {
        return addRequest(HttpMethod.POST, url, params, callback, caller);
    }

    public <T> String post(final String url,
                           final GsonCallback<T> callback,
                           Object caller) {
        return post(url, emptyMap(), callback, caller);
    }

    public <T> String post(final String url, final Map<String, String> forms,
                           final GsonCallback<T> callback,
                           Object caller) {
        return addRequest(HttpMethod.POST, url, null, forms, callback, caller);
    }

    public <T> String post(final String url, final NextParams params,
                           final GsonCallback<T> callback,
                           Object caller) {
        return addRequest(HttpMethod.POST, url, params, callback, caller);
    }


    public static String put(final String url, final ResponseCallback callback,
                             Object caller) {
        return put(url, emptyMap(), callback, caller);
    }

    public static String put(final String url, final Map<String, String> forms,
                             final ResponseCallback callback,
                             Object caller) {
        return addRequest(HttpMethod.PUT, url, null, forms, callback, caller);
    }

    public static String put(final String url, final NextParams params,
                             final ResponseCallback callback,
                             Object caller) {
        return addRequest(HttpMethod.PUT, url, params, callback, caller);
    }

    public static String put(final String url, final StringCallback callback,
                             Object caller) {
        return put(url, emptyMap(), callback, caller);
    }

    public static String put(final String url, final Map<String, String> forms,
                             final StringCallback callback,
                             Object caller) {
        return addRequest(HttpMethod.PUT, url, null, forms, callback, caller);
    }

    public static String put(final String url, final NextParams params,
                             final StringCallback callback,
                             Object caller) {
        return addRequest(HttpMethod.PUT, url, params, callback, caller);
    }

    public <T> String put(final String url, final GsonCallback<T> callback,
                          Object caller) {
        return put(url, emptyMap(), callback, caller);
    }

    public <T> String put(final String url, final Map<String, String> forms,
                          final GsonCallback<T> callback,
                          Object caller) {
        return addRequest(HttpMethod.PUT, url, null, forms, callback, caller);
    }

    public <T> String put(final String url, final NextParams params,
                          final GsonCallback<T> callback,
                          Object caller) {
        return addRequest(HttpMethod.PUT, url, params, callback, caller);
    }


    public static String download(final String url, final File file, final FileCallback callback,
                                  Object caller) {
        return download(url, file, emptyMap(), callback, caller);
    }

    public static String download(final String url, final File file, final Map<String, String> queries,
                                  final FileCallback callback,
                                  Object caller) {
        final NextRequest request = new NextRequest(HttpMethod.GET, url).queries(queries);
        return getHttpQueue().add(request, file, callback, caller);
    }

    public static String download(final String url, final File file, final NextParams params,
                                  final FileCallback callback,
                                  Object caller) {
        final NextRequest request = new NextRequest(HttpMethod.GET, url, params);
        return getHttpQueue().add(request, file, callback, caller);
    }

    private static String addRequest(final HttpMethod method,
                                     final String url,
                                     final NextParams params,
                                     final ResponseCallback callback,
                                     Object caller) {
        final NextRequest request = new NextRequest(method, url).params(params);
        return getHttpQueue().add(request, callback, caller);
    }

    private static String addRequest(final HttpMethod method,
                                     final String url,
                                     final NextParams params,
                                     final StringCallback callback,
                                     Object caller) {
        final NextRequest request = new NextRequest(method, url).params(params);
        return getHttpQueue().add(request, callback, caller);
    }

    private static <T> String addRequest(final HttpMethod method,
                                         final String url,
                                         final NextParams params,
                                         final GsonCallback<T> callback,
                                         Object caller) {
        final NextRequest request = new NextRequest(method, url).params(params);
        return getHttpQueue().add(request, callback, caller);
    }

    private static String addRequest(final HttpMethod method, final String url,
                                     final Map<String, String> queries,
                                     final Map<String, String> forms,
                                     final ResponseCallback callback,
                                     Object caller) {
        return addRequest(method, url, queries, forms, null, callback, caller);
    }

    private static String addRequest(final HttpMethod method, final String url,
                                     final Map<String, String> queries,
                                     final Map<String, String> forms,
                                     final StringCallback callback,
                                     Object caller) {
        return addRequest(method, url, queries, forms, null, callback, caller);
    }

    private static <T> String addRequest(final HttpMethod method, final String url,
                                         final Map<String, String> queries,
                                         final Map<String, String> forms,
                                         final GsonCallback<T> callback,
                                         Object caller) {
        return addRequest(method, url, queries, forms, null, callback, caller);
    }

    private static String addRequest(final HttpMethod method, final String url,
                                     final Map<String, String> queries,
                                     final Map<String, String> forms,
                                     final Map<String, String> headers,
                                     final ResponseCallback callback,
                                     Object caller) {
        final NextRequest request = new NextRequest(method, url).queries(queries).
                forms(forms).headers(headers);
        return getHttpQueue().add(request, callback, caller);
    }

    private static String addRequest(final HttpMethod method, final String url,
                                     final Map<String, String> queries,
                                     final Map<String, String> forms,
                                     final Map<String, String> headers,
                                     final StringCallback callback,
                                     Object caller) {
        final NextRequest request = new NextRequest(method, url).queries(queries).
                forms(forms).headers(headers);
        return getHttpQueue().add(request, callback, caller);
    }

    private static <T> String addRequest(final HttpMethod method, final String url,
                                         final Map<String, String> queries,
                                         final Map<String, String> forms,
                                         final Map<String, String> headers,
                                         final GsonCallback<T> callback,
                                         Object caller) {
        final NextRequest request = new NextRequest(method, url).queries(queries).
                forms(forms).headers(headers);
        return getHttpQueue().add(request, callback, caller);
    }


}
