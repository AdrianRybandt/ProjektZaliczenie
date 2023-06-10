package Model.Location;

import Model.Item;
import Model.Person.NPC;

public class CityLocation extends Location implements ITrade{
    private NPC npc;

    public CityLocation(String name, String description, NPC npc)
    {
        this.setName(name);
        this.setDescription(description);
        this.setNpc(npc);
    }

    public NPC getNPC() {
        return npc;
    }

    public void setNpc(NPC npc) {
        this.npc = npc;
    }
}
