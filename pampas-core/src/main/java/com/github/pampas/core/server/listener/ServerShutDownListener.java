package com.github.pampas.core.server.listener;

import com.github.pampas.common.extension.Scope;
import com.github.pampas.common.extension.Spi;

/**
 * Description:
 * User: darrenfu
 * Date: 2018-09-17
 */
@Spi(scope = Scope.SINGLETON)
public interface ServerShutDownListener {
}
