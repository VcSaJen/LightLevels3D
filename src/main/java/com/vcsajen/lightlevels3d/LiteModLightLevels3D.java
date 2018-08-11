package com.vcsajen.lightlevels3d;

import com.mojang.realmsclient.dto.RealmsServer;
import com.mumfrey.liteloader.JoinGameListener;
import com.mumfrey.liteloader.PostRenderListener;
import com.mumfrey.liteloader.Tickable;
import com.mumfrey.liteloader.core.LiteLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.server.SPacketJoinGame;
import net.minecraft.util.text.TextComponentString;

import java.io.File;

public class LiteModLightLevels3D implements JoinGameListener, PostRenderListener, Tickable {

    public static KeyBinding kbToggleLightLevels; //
    public static KeyBinding kbIncLightLevels; //
    public static KeyBinding kbDecLightLevels; //

    @Override
    public void onJoinGame(INetHandler netHandler, SPacketJoinGame joinGamePacket, ServerData serverData, RealmsServer realmsServer) {
        EntityPlayerSP player = Minecraft.getMinecraft().player;
        player.sendMessage(new TextComponentString("Light Levels 3D is successfully loaded!"));
    }

    @Override
    public String getVersion() {
        return LiteLoader.getInstance().getModMetaData(this, "version", "1.0");
    }

    @Override
    public void init(File configPath) {

    }

    @Override
    public void upgradeSettings(String version, File configPath, File oldConfigPath) {

    }

    @Override
    public String getName() {
        return LiteLoader.getInstance().getModMetaData(this, "displayName", this.getClass().getSimpleName());
    }

    @Override
    public void onPostRenderEntities(float partialTicks) {

    }

    @Override
    public void onPostRender(float partialTicks) {

    }

    @Override
    public void onTick(Minecraft minecraft, float partialTicks, boolean inGame, boolean clock) {

        //EntityPlayerSP player = Minecraft.getMinecraft().player;

    }
}
