package com.min.action;
import java.util.UUID;
import com.min.service.CompanyRegisterService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.io.File;

@Controller
public class CompanyRegisterAction extends ActionSupport {
    @Resource
    private CompanyRegisterService companyRegisterService;
    private String Flag;
    private String LoginName;

    private String CompanyName;
    private String CorporateName;
    private String CorporateIDNo;
    private String CorporateContactNo;
    private String RegisterTime;
    private String OperatingPlace;
    private int OperatingKind;
    private int InvestigateRes;
    private String BLicenseRegisterNo;
    private File BLicenseSrc;
    private String BLicenseDeadline;
    private String PLicenseNo;
    private File PLicenseSrc;
    private String PLicenseDeadline;
    private String AEPCertificateNo;
    private File AEPCertificateSrc;
    private String TaxRCNo;
    private File TaxRCSrc;
    private String FoodDistributionLicenseNo;
    private File FoodDistributionLicenseSrc;
    private String FoodHygienePermitNo;
    private File FoodHygienePermitSrc;
    private String OrganizationCodeCertificateNo;
    private File OrganizationCodeCertificateSrc;
    private String RoadTransportBusinessLicenseNo;
    private File RoadTransportBusinessLicenseSrc;
    private String AnimalEpidemicPCNo;
    private File AnimalEpidemicPCSrc;
    private String SecretKeys;
    private String PASSWORD;

    public String getFlag() {
        return Flag;
    }

    public String getLoginName() {
        return LoginName;
    }

    public String getAEPCertificateNo() {
        return AEPCertificateNo;
    }

    public File getAEPCertificateSrc() {
        return AEPCertificateSrc;
    }

    public String getAnimalEpidemicPCNo() {
        return AnimalEpidemicPCNo;
    }

    public File getAnimalEpidemicPCSrc() {
        return AnimalEpidemicPCSrc;
    }

    public String getBLicenseDeadline() {
        return BLicenseDeadline;
    }

    public String getBLicenseRegisterNo() {
        return BLicenseRegisterNo;
    }

    public File getBLicenseSrc() {
        return BLicenseSrc;
    }



    public String getCompanyName() {
        return CompanyName;
    }

    public String getCorporateContactNo() {
        return CorporateContactNo;
    }

    public String getCorporateIDNo() {
        return CorporateIDNo;
    }

    public String getCorporateName() {
        return CorporateName;
    }

    public String getFoodDistributionLicenseNo() {
        return FoodDistributionLicenseNo;
    }

    public File getFoodDistributionLicenseSrc() {
        return FoodDistributionLicenseSrc;
    }

    public String getFoodHygienePermitNo() {
        return FoodHygienePermitNo;
    }

    public File getFoodHygienePermitSrc() {
        return FoodHygienePermitSrc;
    }

    public String getOperatingPlace() {
        return OperatingPlace;
    }

    public String getOrganizationCodeCertificateNo() {
        return OrganizationCodeCertificateNo;
    }

    public File getOrganizationCodeCertificateSrc() {
        return OrganizationCodeCertificateSrc;
    }

    public String getPLicenseDeadline() {
        return PLicenseDeadline;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getPLicenseNo() {
        return PLicenseNo;
    }

    public File getPLicenseSrc() {
        return PLicenseSrc;
    }

    public String getRegisterTime() {
        return RegisterTime;
    }

    public String getRoadTransportBusinessLicenseNo() {
        return RoadTransportBusinessLicenseNo;
    }

    public File getRoadTransportBusinessLicenseSrc() {
        return RoadTransportBusinessLicenseSrc;
    }

    public String getSecretKeys() {
        return SecretKeys;
    }

    public String getTaxRCNo() {
        return TaxRCNo;
    }

    public File getTaxRCSrc() {
        return TaxRCSrc;
    }

    public int getInvestigateRes() {
        return InvestigateRes;
    }

    public int getOperatingKind() {
        return OperatingKind;
    }

    public void setFlag(String flag) {
        Flag = flag;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public void setAEPCertificateNo(String AEPCertificateNo) {
        this.AEPCertificateNo = AEPCertificateNo;
    }

    public void setAEPCertificateSrc(File AEPCertificateSrc) {
        this.AEPCertificateSrc = AEPCertificateSrc;
    }

    public void setBLicenseDeadline(String BLicenseDeadline) {
        this.BLicenseDeadline = BLicenseDeadline;
    }

    public void setAnimalEpidemicPCNo(String animalEpidemicPCNo) {
        AnimalEpidemicPCNo = animalEpidemicPCNo;
    }

    public void setBLicenseRegisterNo(String BLicenseRegisterNo) {
        this.BLicenseRegisterNo = BLicenseRegisterNo;
    }

    public void setBLicenseSrc(File BLicenseSrc) {
        this.BLicenseSrc = BLicenseSrc;
    }

    public void setAnimalEpidemicPCSrc(File animalEpidemicPCSrc) {
        AnimalEpidemicPCSrc = animalEpidemicPCSrc;
    }



    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public void setCompanyRegisterService(CompanyRegisterService companyRegisterService) {
        this.companyRegisterService = companyRegisterService;
    }

    public void setCorporateContactNo(String corporateContactNo) {
        CorporateContactNo = corporateContactNo;
    }

    public void setCorporateIDNo(String corporateIDNo) {
        CorporateIDNo = corporateIDNo;
    }

    public void setCorporateName(String corporateName) {
        CorporateName = corporateName;
    }

    public void setFoodDistributionLicenseNo(String foodDistributionLicenseNo) {
        FoodDistributionLicenseNo = foodDistributionLicenseNo;
    }

    public void setFoodDistributionLicenseSrc(File foodDistributionLicenseSrc) {
        FoodDistributionLicenseSrc = foodDistributionLicenseSrc;
    }

    public void setFoodHygienePermitNo(String foodHygienePermitNo) {
        FoodHygienePermitNo = foodHygienePermitNo;
    }

    public void setFoodHygienePermitSrc(File foodHygienePermitSrc) {
        FoodHygienePermitSrc = foodHygienePermitSrc;
    }

    public void setInvestigateRes(int investigateRes) {
        InvestigateRes = investigateRes;
    }

    public void setOperatingKind(int operatingKind) {
        OperatingKind = operatingKind;
    }

    public void setOperatingPlace(String operatingPlace) {
        OperatingPlace = operatingPlace;
    }

    public void setOrganizationCodeCertificateNo(String organizationCodeCertificateNo) {
        OrganizationCodeCertificateNo = organizationCodeCertificateNo;
    }

    public void setOrganizationCodeCertificateSrc(File organizationCodeCertificateSrc) {
        OrganizationCodeCertificateSrc = organizationCodeCertificateSrc;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public void setPLicenseDeadline(String PLicenseDeadline) {
        this.PLicenseDeadline = PLicenseDeadline;
    }

    public void setPLicenseNo(String PLicenseNo) {
        this.PLicenseNo = PLicenseNo;
    }

    public void setPLicenseSrc(File PLicenseSrc) {
        this.PLicenseSrc = PLicenseSrc;
    }

    public void setRegisterTime(String registerTime) {
        RegisterTime = registerTime;
    }

    public void setRoadTransportBusinessLicenseNo(String roadTransportBusinessLicenseNo) {
        RoadTransportBusinessLicenseNo = roadTransportBusinessLicenseNo;
    }

    public void setRoadTransportBusinessLicenseSrc(File roadTransportBusinessLicenseSrc) {
        RoadTransportBusinessLicenseSrc = roadTransportBusinessLicenseSrc;
    }

    public void setSecretKeys(String secretKeys) {
        SecretKeys = secretKeys;
    }

    public void setTaxRCNo(String taxRCNo) {
        TaxRCNo = taxRCNo;
    }

    public void setTaxRCSrc(File taxRCSrc) {
        TaxRCSrc = taxRCSrc;
    }


    public String execute(){

//        System.out.println("CompanyName: "+CompanyName);
//        System.out.println("CorporateName: "+CorporateName);
//        System.out.println("CorporateIDNo: "+CorporateIDNo);
//        System.out.println("CorporateContactNo: "+CorporateContactNo);
//        System.out.println("RegisterTime: "+RegisterTime);
//        System.out.println("OperatingPlace: "+OperatingPlace);
//        System.out.println("OperatingKind: "+OperatingKind);
//        System.out.println("InvestigateRes: "+InvestigateRes);
//        System.out.println("BLicenseRegisterNo: "+BLicenseRegisterNo);
//        System.out.println("BLicenseSrc: "+BLicenseSrc);
//        System.out.println("BLicenseDeadline: "+BLicenseDeadline);
//        System.out.println("PLicenseNo: "+PLicenseNo);
//        System.out.println("PLicenseSrc: "+PLicenseSrc);
//        System.out.println("PLicenseDeadline: "+PLicenseDeadline);
//        System.out.println("AEPCertificateNo: "+AEPCertificateNo);
//        System.out.println("AEPCertificateSrc: "+AEPCertificateSrc);
//        System.out.println("TaxRCNo: "+TaxRCNo);
//        System.out.println("TaxRCSrc: "+TaxRCSrc);
//        System.out.println("FoodDistributionLicenseNo: "+FoodDistributionLicenseNo);
//        System.out.println("FoodDistributionLicenseSrc: "+FoodDistributionLicenseSrc);
//        System.out.println("FoodHygienePermitNo: "+FoodHygienePermitNo);
//        System.out.println("FoodHygienePermitSrc: "+FoodHygienePermitSrc);
//        System.out.println("OrganizationCodeCertificateNo: "+OrganizationCodeCertificateNo);
//        System.out.println("OrganizationCodeCertificateSrc: "+OrganizationCodeCertificateSrc);
//        System.out.println("RoadTransportBusinessLicenseNo: "+RoadTransportBusinessLicenseNo);
//        System.out.println("RoadTransportBusinessLicenseSrc: "+RoadTransportBusinessLicenseSrc);
//        System.out.println("AnimalEpidemicPCNo: "+AnimalEpidemicPCNo);
//        System.out.println("AnimalEpidemicPCSrc: "+AnimalEpidemicPCSrc);
//        System.out.println("SecretKeys: "+SecretKeys);
//        System.out.println("PASSWORD: "+PASSWORD);
        String CompanyID=UUID.randomUUID().toString().replaceAll("-","");
        File f = new File("E:/allpictures");
        try {
            String BLicenseImgSrc=null;
            if(BLicenseSrc!=null){
                FileUtils.copyFile(BLicenseSrc, new File(f, CompanyID + "01.png"));
                BLicenseImgSrc=CompanyID + "01.png";
            }

            String PLicenseImgSrc=null;
            if(PLicenseSrc!=null){
                FileUtils.copyFile(PLicenseSrc, new File(f, CompanyID + "02.png"));
                PLicenseImgSrc=CompanyID + "02.png";
            }

            String AEPCertificateImgSrc=null;
            if(AEPCertificateSrc!=null){
                FileUtils.copyFile(AEPCertificateSrc, new File(f, CompanyID + "03.png"));
                AEPCertificateImgSrc=CompanyID + "03.png";
            }

            String TaxRCImgSrc=null;
            if(TaxRCSrc!=null){
                FileUtils.copyFile(TaxRCSrc, new File(f, CompanyID + "04.png"));
                TaxRCImgSrc=CompanyID + "04.png";
            }

            String FoodDistributionLicenseImgSrc=null;
            if(FoodDistributionLicenseSrc!=null){
                FileUtils.copyFile(FoodDistributionLicenseSrc, new File(f, CompanyID + "05.png"));
                FoodDistributionLicenseImgSrc=CompanyID + "05.png";
            }

            String FoodHygienePermitImgSrc=null;
            if(FoodHygienePermitSrc!=null){
                FileUtils.copyFile(FoodHygienePermitSrc, new File(f, CompanyID + "06.png"));
                FoodHygienePermitImgSrc=CompanyID + "06.png";
            }

            String OrganizationCodeCertificateImgSrc=null;
            if(OrganizationCodeCertificateSrc!=null){
                FileUtils.copyFile(OrganizationCodeCertificateSrc, new File(f, CompanyID + "07.png"));
                OrganizationCodeCertificateImgSrc=CompanyID + "07.png";
            }

            String RoadTransportBusinessLicenseImgSrc=null;
            if(RoadTransportBusinessLicenseSrc!=null){
                FileUtils.copyFile(FoodDistributionLicenseSrc, new File(f, CompanyID + "08.png"));
                RoadTransportBusinessLicenseImgSrc=CompanyID + "08.png";
            }

            String AnimalEpidemicPCImgSrc=null;
            if(AnimalEpidemicPCSrc!=null){
                FileUtils.copyFile(AnimalEpidemicPCSrc, new File(f, CompanyID + "09.png"));
                AnimalEpidemicPCImgSrc=CompanyID + "09.png";
            }
            companyRegisterService.addCompanyInfor(Flag,LoginName,CompanyID, CompanyName, CorporateName, CorporateIDNo, CorporateContactNo, RegisterTime, OperatingPlace, OperatingKind, InvestigateRes, BLicenseRegisterNo, BLicenseImgSrc, BLicenseDeadline, PLicenseNo, PLicenseImgSrc, PLicenseDeadline, AEPCertificateNo, AEPCertificateImgSrc, TaxRCNo, TaxRCImgSrc, FoodDistributionLicenseNo, FoodDistributionLicenseImgSrc, FoodHygienePermitNo, FoodHygienePermitImgSrc, OrganizationCodeCertificateNo, OrganizationCodeCertificateImgSrc, RoadTransportBusinessLicenseNo, RoadTransportBusinessLicenseImgSrc, AnimalEpidemicPCNo, AnimalEpidemicPCImgSrc,SecretKeys, PASSWORD);


        }catch (Exception io){

        }
        return "success";
    }
}
