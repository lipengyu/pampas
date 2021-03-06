/*
 *
 *  *  Copyright 2009-2018.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */

package com.github.pampas.common.exec;

import com.github.pampas.common.exec.payload.PampasRequest;
import com.github.pampas.common.exec.payload.PampasResponse;
import com.github.pampas.common.extension.Scope;
import com.github.pampas.common.extension.Spi;

/**
 * worker回调、过滤器
 * Created by darrenfu on 18-1-24.
 *
 * @param <Q> the type parameter
 * @param <R> the type parameter
 * @author: darrenfu
 * @date: 18 -1-24
 */
@Spi(scope = Scope.SINGLETON)
public interface Filter<Q extends Object, R extends Object> {

    /**
     * 请求执行前运行.
     *
     * @param req the req
     * @param filterChain
     */
    void before(PampasRequest<Q> req, FilterChain filterChain);

    /**
     * 响应成功时执行
     *
     * @param req  the req
     * @param resp the resp
     * @param filterChain
     * @return the response info
     */
    void onSuccess(PampasRequest<Q> req, PampasResponse<R> resp, FilterChain filterChain);

    /**
     * 响应异常时执行
     *
     * @param req       the req
     * @param throwable the throwable
     * @param filterChain
     * @return the response info
     */
    void onException(PampasRequest<Q> req, Throwable throwable, FilterChain filterChain);
}
