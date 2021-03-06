package nl.imine.pixelmon.packingmule.bag;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import nl.imine.pixelmon.packingmule.bag.item.SpecializedItemReward;
import nl.imine.pixelmon.packingmule.service.Identifyable;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class BagCategory implements Identifyable<String> {

    private final String id;
    private final List<SpecializedItemReward> allowedItems;

    @JsonCreator
    public BagCategory(@JsonProperty("id") String id, @JsonProperty("allowedItems") List<SpecializedItemReward> allowedItems) {
        this.id = id;
        this.allowedItems = allowedItems;
    }

    public List<SpecializedItemReward> getAllowedItems() {
        return allowedItems;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BagCategory that = (BagCategory) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(allowedItems, that.allowedItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, allowedItems);
    }
}
