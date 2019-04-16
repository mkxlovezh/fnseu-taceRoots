package com.min.service;

import com.min.dao.CompanyDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CompanyRegisterService {
    @Resource
    private CompanyDao companyDao;
    public void addCompanyInfor(String Flag,String LoginName,String CompanyID,String CompanyName,String CorporateName,String CorporateIDNo,String CorporateContactNo,String RegisterTime,String OperatingPlace,int OperatingKind,int InvestigateRes,String BLicenseRegisterNo,String BLicenseSrc,String BLicenseDeadline,String PLicenseNo,String PLicenseSrc,String PLicenseDeadline,String AEPCertificateNo,String AEPCertificateSrc,String TaxRCNo,String TaxRCSrc,String FoodDistributionLicenseNo,String FoodDistributionLicenseSrc,String FoodHygienePermitNo,String FoodHygienePermitSrc,String OrganizationCodeCertificateNo,String OrganizationCodeCertificateSrc,String RoadTransportBusinessLicenseNo,String RoadTransportBusinessLicenseSrc,String AnimalEpidemicPCNo,String AnimalEpidemicPCSrc,String SecretKeys,String PASSWORD){
        companyDao.addCompany(Flag,LoginName,CompanyID,CompanyName,CorporateName,CorporateIDNo,CorporateContactNo,RegisterTime,OperatingPlace,OperatingKind,InvestigateRes,BLicenseRegisterNo,BLicenseSrc,BLicenseDeadline,PLicenseNo,PLicenseSrc,PLicenseDeadline,AEPCertificateNo,AEPCertificateSrc,TaxRCNo,TaxRCSrc,FoodDistributionLicenseNo,FoodDistributionLicenseSrc,FoodHygienePermitNo,FoodHygienePermitSrc,OrganizationCodeCertificateNo,OrganizationCodeCertificateSrc,RoadTransportBusinessLicenseNo,RoadTransportBusinessLicenseSrc,AnimalEpidemicPCNo,AnimalEpidemicPCSrc,SecretKeys,PASSWORD);
    }

}
