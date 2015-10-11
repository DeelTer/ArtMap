package me.Fupery.ArtMap.Protocol.Packet;

public class ArtistPacket {

    protected Object packet;
    protected PacketType type;

    protected ArtistPacket(Object packet, PacketType type) {
        this.packet = packet;
        this.type = type;
    }

    public static class PacketLook extends ArtistPacket {
        private float pitch, yaw;

        public PacketLook(Object packet, PacketType type, float yaw, float pitch) {
            super(packet, type);
            this.yaw = yaw;
            this.pitch = pitch;
        }

        public float getPitch() {
            return pitch;
        }

        public float getYaw() {
            return yaw;
        }
    }

    public static class PacketArmSwing extends ArtistPacket {

        public PacketArmSwing(Object packet, PacketType type) {
            super(packet, type);
        }
    }

    public static class PacketVehicle extends ArtistPacket {
        private boolean dismount;

        public PacketVehicle(Object packet, PacketType type, boolean dismount) {
            super(packet, type);
            this.dismount = dismount;
        }

        public boolean isDismount() {
            return dismount;
        }
    }
}
