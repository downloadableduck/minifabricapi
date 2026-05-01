/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.fabric.impl.client.registry.sync;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.server.command.ModIdArgument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking;
import net.fabricmc.fabric.impl.registry.sync.packet.RegistrySyncPayload;

import static com.jeff.minifabricapi.MiniFabricAPI.MODID;

@Mod(value=MODID, dist = Dist.CLIENT)
public class FabricRegistryClientInit {
	private static final Logger LOGGER = LoggerFactory.getLogger(FabricRegistryClientInit.class);

	@SubscribeEvent
	public void onInitializeClient() {
		ClientConfigurationNetworking.registerGlobalReceiver(RegistrySyncPayload.ID, ClientRegistrySyncHandler::receivePacket);
	}
}
