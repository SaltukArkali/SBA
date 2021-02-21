package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParaBankPojo01 {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("accountId")
    private Integer accountId;
    @JsonProperty("date")
    private String date;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("description")
    private String description;
    @JsonProperty("type")
    private String type;

    /**
     * No args constructor for use in serialization
     *
     */
    public ParaBankPojo01() {
    }

    /**
     *
     * @param date
     * @param accountId
     * @param amount
     * @param description
     * @param id
     * @param type
     */
    public ParaBankPojo01(Integer id, Integer accountId, String date, Integer amount, String description, String type) {
        super();
        this.id = id;
        this.accountId = accountId;
        this.date = date;
        this.amount = amount;
        this.description = description;
        this.type = type;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("accountId")
    public Integer getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("accountId", accountId).append("date", date).append("amount", amount).append("description", description).append("type", type).toString();
    }

}
