package com.github.may2beez.farmhelperv2.config.page;

import cc.polyfrost.oneconfig.config.annotations.Switch;

public class FailsafeNotificationsPage {
    @Switch(
            name = "Rotation Check Notifications",
            description = "Whether or not to send a notification when the rotation check failsafe is triggered.",
            category = "Failsafe Notifications"
    )
    public static boolean notifyOnRotationFailsafe = true;

    @Switch(
            name = "Teleportation Check Notifications",
            description = "Whether or not to send a notification when the teleportation check failsafe is triggered.",
            category = "Failsafe Notifications"
    )
    public static boolean notifyOnTeleportationFailsafe = true;

    @Switch(
            name = "Dirt Check Notifications",
            description = "Whether or not to send a notification when the dirt check failsafe is triggered.",
            category = "Failsafe Notifications"
    )
    public static boolean notifyOnDirtFailsafe = true;

    @Switch(
            name = "Item Change Check Notifications",
            description = "Whether or not to send a notification when the item change check failsafe is triggered.",
            category = "Failsafe Notifications"
    )
    public static boolean notifyOnItemChangeFailsafe = true;

    @Switch(
            name = "World Change Check Notifications",
            description = "Whether or not to send a notification when the world change check failsafe is triggered.",
            category = "Failsafe Notifications"
    )
    public static boolean notifyOnWorldChangeFailsafe = true;

    @Switch(
            name = "Bedrock Cage Check Notifications",
            description = "Whether or not to send a notification when the bedrock cage check failsafe is triggered.",
            category = "Failsafe Notifications"
    )
    public static boolean notifyOnBedrockCageFailsafe = true;

    @Switch(
            name = "Evacuate Notifications",
            description = "Whether or not to send a notification when the evacuate failsafe is triggered.",
            category = "Failsafe Notifications"
    )
    public static boolean notifyOnEvacuateFailsafe = false;

    @Switch(
            name = "Banwave Notifications",
            description = "Whether or not to send a notification when the banwave failsafe is triggered.",
            category = "Failsafe Notifications"
    )
    public static boolean notifyOnBanwaveFailsafe = false;

    @Switch(
            name = "Disconnect Notifications",
            description = "Whether or not to send a notification when the disconnect failsafe is triggered.",
            category = "Failsafe Notifications"
    )
    public static boolean notifyOnDisconnectFailsafe = true;

    @Switch(
            name = "Jacob Notifications",
            description = "Whether or not to send a notification when the Jacob failsafe is triggered.",
            category = "Failsafe Notifications"
    )
    public static boolean notifyOnJacobFailsafe = false;


    @Switch(
            name = "Rotation Check Sound Alert",
            description = "Whether or not to play a sound when the rotation check failsafe is triggered.",
            category = "Failsafe Sound Alerts"
    )
    public static boolean alertOnRotationFailsafe = true;

    @Switch(
            name = "Teleportation Check Sound Alert",
            description = "Whether or not to play a sound when the teleportation check failsafe is triggered.",
            category = "Failsafe Sound Alerts"
    )
    public static boolean alertOnTeleportationFailsafe = true;

    @Switch(
            name = "Dirt Check Sound Alert",
            description = "Whether or not to play a sound when the dirt check failsafe is triggered.",
            category = "Failsafe Sound Alerts"
    )
    public static boolean alertOnDirtFailsafe = true;

    @Switch(
            name = "Item Change Check Sound Alert",
            description = "Whether or not to play a sound when the item change check failsafe is triggered.",
            category = "Failsafe Sound Alerts"
    )
    public static boolean alertOnItemChangeFailsafe = true;

    @Switch(
            name = "World Change Check Sound Alert",
            description = "Whether or not to play a sound when the world change check failsafe is triggered.",
            category = "Failsafe Sound Alerts"
    )
    public static boolean alertOnWorldChangeFailsafe = false;

    @Switch(
            name = "Bedrock Cage Check Sound Alert",
            description = "Whether or not to play a sound when the bedrock cage check failsafe is triggered.",
            category = "Failsafe Sound Alerts"
    )
    public static boolean alertOnBedrockCageFailsafe = true;

    @Switch(
            name = "Evacuate Alert",
            description = "Whether or not to play a sound when the evacuate failsafe is triggered.",
            category = "Failsafe Sound Alerts"
    )
    public static boolean alertOnEvacuateFailsafe = false;

    @Switch(
            name = "Banwave Alert",
            description = "Whether or not to play a sound when the banwave failsafe is triggered.",
            category = "Failsafe Sound Alerts"
    )
    public static boolean alertOnBanwaveFailsafe = false;

    @Switch(
            name = "Disconnect Alert",
            description = "Whether or not to play a sound when the disconnect failsafe is triggered.",
            category = "Failsafe Sound Alerts"
    )
    public static boolean alertOnDisconnectFailsafe = false;

    @Switch(
            name = "Jacob Alert",
            description = "Whether or not to play a sound when the Jacob failsafe is triggered.",
            category = "Failsafe Sound Alerts"
    )
    public static boolean alertOnJacobFailsafe = false;


    @Switch(
            name = "Rotation Check Tag Everyone",
            description = "Whether or not to tag everyone in the webhook message when the rotation check failsafe is triggered.",
            category = "Failsafe Tag Everyone"
    )
    public static boolean tagEveryoneOnRotationFailsafe = true;

    @Switch(
            name = "Teleportation Check Tag Everyone",
            description = "Whether or not to tag everyone in the webhook message when the teleportation check failsafe is triggered.",
            category = "Failsafe Tag Everyone"
    )
    public static boolean tagEveryoneOnTeleportationFailsafe = true;

    @Switch(
            name = "Dirt Check Tag Everyone",
            description = "Whether or not to tag everyone in the webhook message when the dirt check failsafe is triggered.",
            category = "Failsafe Tag Everyone"
    )
    public static boolean tagEveryoneOnDirtFailsafe = true;

    @Switch(
            name = "Item Change Check Tag Everyone",
            description = "Whether or not to tag everyone in the webhook message when the item change check failsafe is triggered.",
            category = "Failsafe Tag Everyone"
    )
    public static boolean tagEveryoneOnItemChangeFailsafe = true;

    @Switch(
            name = "World Change Check Tag Everyone",
            description = "Whether or not to tag everyone in the webhook message when the world change check failsafe is triggered.",
            category = "Failsafe Tag Everyone"
    )
    public static boolean tagEveryoneOnWorldChangeFailsafe = false;

    @Switch(
            name = "Bedrock Cage Check Tag Everyone",
            description = "Whether or not to tag everyone in the webhook message when the bedrock cage check failsafe is triggered.",
            category = "Failsafe Tag Everyone"
    )
    public static boolean tagEveryoneOnBedrockCageFailsafe = true;

    @Switch(
            name = "Evacuate Tag Everyone",
            description = "Whether or not to tag everyone in the webhook message when the evacuate failsafe is triggered.",
            category = "Failsafe Tag Everyone"
    )
    public static boolean tagEveryoneOnEvacuateFailsafe = false;

    @Switch(
            name = "Banwave Tag Everyone",
            description = "Whether or not to tag everyone in the webhook message when the banwave failsafe is triggered.",
            category = "Failsafe Tag Everyone"
    )
    public static boolean tagEveryoneOnBanwaveFailsafe = false;

    @Switch(
            name = "Disconnect Tag Everyone",
            description = "Whether or not to tag everyone in the webhook message when the disconnect failsafe is triggered.",
            category = "Failsafe Tag Everyone"
    )
    public static boolean tagEveryoneOnDisconnectFailsafe = false;

    @Switch(
            name = "Jacob Tag Everyone",
            description = "Whether or not to tag everyone in the webhook message when the Jacob failsafe is triggered.",
            category = "Failsafe Tag Everyone"
    )
    public static boolean tagEveryoneOnJacobFailsafe = false;
}