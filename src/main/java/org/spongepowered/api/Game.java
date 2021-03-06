/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api;

import org.spongepowered.api.plugin.PluginManager;
import org.spongepowered.api.service.ServiceManager;
import org.spongepowered.api.service.command.CommandService;
import org.spongepowered.api.service.event.EventManager;
import org.spongepowered.api.service.scheduler.SchedulerService;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.TeleportHelper;

/**
 * The core accessor of the API. The implementation uses this to pass
 * constructed objects.
 */
public interface Game {

    /**
     * Returns the current platform, or implementation, this {@link Game} is running on.
     *
     * @return The current implementation
     */
    Platform getPlatform();

    /**
     * Gets the {@link Server}.
     *
     * @return The server
     */
    Server getServer();

    /**
     * Gets the {@link PluginManager}.
     *
     * @return The plugin manager
     */
    PluginManager getPluginManager();

    /**
     * Gets the {@link EventManager}.
     *
     * @return The event manager
     */
    EventManager getEventManager();

    /**
     * Gets the {@link GameRegistry}.
     *
     * @return The game registry
     */
    GameRegistry getRegistry();

    /**
     * Get the game's instance of the service manager, which is the gateway
     * to various services provided by Sponge (command registration and so on).
     *
     * <p>Services registered by other plugins may be available too.</p>
     *
     * @return The service manager
     */
    ServiceManager getServiceManager();

    /**
     * Gets the scheduler used to schedule tasks.
     *
     * @return The scheduler
     */
    SchedulerService getScheduler();

    /**
     * Get the command dispatcher used for registering and dispatching
     * registered commands.
     *
     * @return The command dispatcher
     */
    CommandService getCommandDispatcher();

    /**
     * Gets the {@link TeleportHelper}, used to find safe {@link Location}s.
     * @return The teleport helper
     */
    TeleportHelper getTeleportHelper();

}
