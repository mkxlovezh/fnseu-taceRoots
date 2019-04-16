package com.min.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface CompanyDao {
    public void addCompany(String Flag,String LoginName,String CompanyID,String CompanyName,String CorporateName,String CorporateIDNo,String CorporateContactNo,String RegisterTime,String OperatingPlace,int OperatingKind,int InvestigateRes,String BLicenseRegisterNo,String BLicenseSrc,String BLicenseDeadline,String PLicenseNo,String PLicenseSrc,String PLicenseDeadline,String AEPCertificateNo,String AEPCertificateSrc,String TaxRCNo,String TaxRCSrc,String FoodDistributionLicenseNo,String FoodDistributionLicenseSrc,String FoodHygienePermitNo,String FoodHygienePermitSrc,String OrganizationCodeCertificateNo,String OrganizationCodeCertificateSrc,String RoadTransportBusinessLicenseNo,String RoadTransportBusinessLicenseSrc,String AnimalEpidemicPCNo,String AnimalEpidemicPCSrc,String SecretKeys,String PASSWORD);
    public String getID(String LoginName);
    public ArrayList<ArrayList<Object>> getEmployeeList(String CompanyID, String table);
    public void deleteEmployee(String id);
    public Map<String,Object> CompanyInfomationDisplay(String LoginName);
    public String check(String name,String password);

}
