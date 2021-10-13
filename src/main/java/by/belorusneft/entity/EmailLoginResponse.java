package by.belorusneft.entity;

public class EmailLoginResponse {

    private String partnerEmailAddress;
    private String statusCheckEmailAddress;
    private String statusSendingConfirmationCode;

    public String getPartnerEmailAddress() {
        return partnerEmailAddress;
    }

    public void setPartnerEmailAddress(String partnerEmailAddress) {
        this.partnerEmailAddress = partnerEmailAddress;
    }

    public String getStatusSendingConfirmationCode() {
        return statusSendingConfirmationCode;
    }

    public void setStatusSendingConfirmationCode(String statusSendingConfirmationCode) {
        this.statusSendingConfirmationCode = statusSendingConfirmationCode;
    }

    public String getStatusCheckEmailAddress() {
        return statusCheckEmailAddress;
    }

    public void setStatusCheckEmailAddress(String statusCheckEmailAddress) {
        this.statusCheckEmailAddress = statusCheckEmailAddress;
    }
}
