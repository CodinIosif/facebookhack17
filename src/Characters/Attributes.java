package Characters;

/**
 * Created by codiniosifpacuraru on 11/03/2017.
 */
public final class Attributes {

    private final AttributesNames attributesName;
    private int attributeValue;

    public Attributes(AttributesNames attributesName, int attributeValue) {
        this.attributesName = attributesName;
        this.attributeValue = attributeValue;
    }

    public AttributesNames getAttributesName() {
        return attributesName;
    }

    public int getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(int attributeValue) {
        this.attributeValue = attributeValue;
    }

    public void incrementAttribute(Attributes attribute) {
        this.attributeValue = attribute.getAttributeValue() + 1;
    }

    public void incrementExpNormal(Attributes attribute) {
        this.attributeValue = attribute.getAttributeValue() + 150;
    }

    public void incrementExpBoss(Attributes attribute) {
        this.attributeValue = attribute.getAttributeValue() + 450;
    }
}
