package com.min.dao;

import org.hibernate.SessionFactory;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class CompanyDaoImpl implements CompanyDao {
    @Resource
    private SessionFactory sessionFactory;
    public void addCompany(String Flag,String LoginName,String CompanyID,String CompanyName,String CorporateName,String CorporateIDNo,String CorporateContactNo,String RegisterTime,String OperatingPlace,int OperatingKind,int InvestigateRes,String BLicenseRegisterNo,String BLicenseSrc,String BLicenseDeadline,String PLicenseNo,String PLicenseSrc,String PLicenseDeadline,String AEPCertificateNo,String AEPCertificateSrc,String TaxRCNo,String TaxRCSrc,String FoodDistributionLicenseNo,String FoodDistributionLicenseSrc,String FoodHygienePermitNo,String FoodHygienePermitSrc,String OrganizationCodeCertificateNo,String OrganizationCodeCertificateSrc,String RoadTransportBusinessLicenseNo,String RoadTransportBusinessLicenseSrc,String AnimalEpidemicPCNo,String AnimalEpidemicPCSrc,String SecretKeys,String PASSWORD){
        String sql="INSERT INTO app_companyregistry (CompanyID,CompanyName,CorporateName,CorporateIDNo,CorporateContactNo,RegisterTime,OperatingPlace,OperatingKind,InvestigateRes,BLicenseRegisterNo,BLicenseSrc,BLicenseDeadline,PLicenseNo,PLicenseSrc,PLicenseDeadline,AEPCertificateNo,AEPCertificateSrc,TaxRCNo,TaxRCSrc,FoodDistributionLicenseNo,FoodDistributionLicenseSrc,FoodHygienePermitNo,FoodHygienePermitSrc,OrganizationCodeCertificateNo,OrganizationCodeCertificateSrc,RoadTransportBusinessLicenseNo,RoadTransportBusinessLicenseSrc,AnimalEpidemicPCNo,AnimalEpidemicPCSrc,SecretKeys,PASSWORD,Flag,LoginName) VALUES(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12,?13,?14,?15,?16,?17,?18,?19,?20,?21,?22,?23,?24,?25,?26,?27,?28,?29,?30,?31,?32,?33) ";
        sessionFactory.getCurrentSession().createSQLQuery(sql).addScalar("CompanyID", StandardBasicTypes.STRING).addScalar("CompanyName",StandardBasicTypes.STRING).addScalar("CorporateName",StandardBasicTypes.STRING).addScalar("CorporateIDNo",StandardBasicTypes.STRING).addScalar("CorporateContactNo",StandardBasicTypes.STRING).addScalar("RegisterTime",StandardBasicTypes.STRING).addScalar("OperatingPlace",StandardBasicTypes.STRING).addScalar("OperatingKind",StandardBasicTypes.INTEGER).addScalar("InvestigateRes",StandardBasicTypes.INTEGER).addScalar("BLicenseRegisterNo",StandardBasicTypes.STRING).addScalar("BLicenseSrc",StandardBasicTypes.STRING).addScalar("BLicenseDeadline",StandardBasicTypes.STRING).addScalar("PLicenseNo",StandardBasicTypes.STRING).addScalar("PLicenseSrc",StandardBasicTypes.STRING).addScalar("PLicenseDeadline",StandardBasicTypes.STRING).addScalar("AEPCertificateNo",StandardBasicTypes.STRING).addScalar("AEPCertificateSrc",StandardBasicTypes.STRING).addScalar("TaxRCNo",StandardBasicTypes.STRING).addScalar("TaxRCSrc",StandardBasicTypes.STRING).addScalar("FoodDistributionLicenseNo",StandardBasicTypes.STRING).addScalar("FoodDistributionLicenseSrc",StandardBasicTypes.STRING).addScalar("FoodHygienePermitNo",StandardBasicTypes.STRING).addScalar("FoodHygienePermitSrc",StandardBasicTypes.STRING).addScalar("OrganizationCodeCertificateNo",StandardBasicTypes.STRING).addScalar("OrganizationCodeCertificateSrc",StandardBasicTypes.STRING).addScalar("RoadTransportBusinessLicenseNo",StandardBasicTypes.STRING).addScalar("RoadTransportBusinessLicenseSrc",StandardBasicTypes.STRING).addScalar("AnimalEpidemicPCNo",StandardBasicTypes.STRING).addScalar("AnimalEpidemicPCSrc",StandardBasicTypes.STRING).addScalar("SecretKeys",StandardBasicTypes.STRING).addScalar("PASSWORD",StandardBasicTypes.STRING).addScalar("Flag",StandardBasicTypes.STRING).addScalar("LoginName",StandardBasicTypes.STRING).setString(1,CompanyID).setString(2,CompanyName).setString(3,CorporateName).setString(4,CorporateIDNo).setString(5,CorporateContactNo).setString(6,RegisterTime).setString(7,OperatingPlace).setInteger(8,OperatingKind).setInteger(9,InvestigateRes).setString(10,BLicenseRegisterNo).setString(11,BLicenseSrc).setString(12,BLicenseDeadline).setString(13,PLicenseNo).setString(14,PLicenseSrc).setString(15,PLicenseDeadline).setString(16,AEPCertificateNo).setString(17,AEPCertificateSrc).setString(18,TaxRCNo).setString(19,TaxRCSrc).setString(20,FoodDistributionLicenseNo).setString(21,FoodDistributionLicenseSrc).setString(22,FoodHygienePermitNo).setString(23,FoodHygienePermitSrc).setString(24,OrganizationCodeCertificateNo).setString(25,OrganizationCodeCertificateSrc).setString(26,RoadTransportBusinessLicenseNo).setString(27,RoadTransportBusinessLicenseSrc).setString(28,AnimalEpidemicPCNo).setString(29,AnimalEpidemicPCSrc).setString(30,SecretKeys).setString(31,PASSWORD).setString(32,Flag).setString(33,LoginName).executeUpdate();
    }
    public String getID(String LoginName){
        System.out.println(LoginName);
        String sql="SELECT id  FROM `app_companyregistry` WHERE LoginName=?1";
        List list=sessionFactory.getCurrentSession().createSQLQuery(sql).addScalar("id",StandardBasicTypes.STRING).setString(1,LoginName).list();
        System.out.println(list.get(0));
        return (String)list.get(0);
    }
    public ArrayList<ArrayList<Object>> getEmployeeList(String ID,String tableName){
        String id=null;
        String name=null;
        String sql="SELECT c.id id,c.ConsumerName NAME, p.IDNo INo, c.ContactNo CNo FROM app_consumerregistry c ,"+tableName+" p WHERE c.id=p.consumerregistry_ptr_id AND p.companyregistry_id =?1";
        List list=sessionFactory.getCurrentSession().createSQLQuery(sql).addScalar("id",StandardBasicTypes.INTEGER).addScalar("NAME",StandardBasicTypes.STRING).addScalar("INo",StandardBasicTypes.STRING).addScalar("CNo",StandardBasicTypes.STRING).setInteger(1,Integer.parseInt(ID)).list();
        ArrayList<ArrayList<Object>> result=new ArrayList<>();
        for(Object element:list){
            ArrayList<Object> l=new ArrayList<>();
            Object[] elements=(Object[])element;
            l.add(elements[0]);
            l.add(elements[1]);
            l.add(elements[2]);
            l.add(elements[3]);
            result.add(l);
        }
        return result;
    }

    @Override
    public void deleteEmployee(String id) {
        String sql="UPDATE `app_consumerregistry` SET CharacterFlag=1 WHERE id=?1";
        sessionFactory.getCurrentSession().createSQLQuery(sql).setInteger(1,Integer.parseInt(id)).executeUpdate();;
    }
    public Map<String,Object> CompanyInfomationDisplay(String LoginName){
        System.out.println(LoginName);
        String sql="select CompanyID,CompanyName,CorporateName,CorporateIDNo,CorporateContactNo,RegisterTime,OperatingPlace,OperatingKind,InvestigateRes,BLicenseRegisterNo,BLicenseSrc,BLicenseDeadline,PLicenseNo,PLicenseSrc,PLicenseDeadline,AEPCertificateNo,AEPCertificateSrc,TaxRCNo,TaxRCSrc,FoodDistributionLicenseNo,FoodDistributionLicenseSrc,FoodHygienePermitNo,FoodHygienePermitSrc,OrganizationCodeCertificateNo,OrganizationCodeCertificateSrc,RoadTransportBusinessLicenseNo,RoadTransportBusinessLicenseSrc,AnimalEpidemicPCNo,AnimalEpidemicPCSrc,SecretKeys,PASSWORD,Flag,LoginName from app_companyregistry WHERE LoginName=?1";
        List list=sessionFactory.getCurrentSession().createSQLQuery(sql).addScalar("CompanyID", StandardBasicTypes.STRING).addScalar("CompanyName",StandardBasicTypes.STRING).addScalar("CorporateName",StandardBasicTypes.STRING).addScalar("CorporateIDNo",StandardBasicTypes.STRING).addScalar("CorporateContactNo",StandardBasicTypes.STRING).addScalar("RegisterTime",StandardBasicTypes.STRING).addScalar("OperatingPlace",StandardBasicTypes.STRING).addScalar("OperatingKind",StandardBasicTypes.INTEGER).addScalar("InvestigateRes",StandardBasicTypes.INTEGER).addScalar("BLicenseRegisterNo",StandardBasicTypes.STRING).addScalar("BLicenseSrc",StandardBasicTypes.STRING).addScalar("BLicenseDeadline",StandardBasicTypes.STRING).addScalar("PLicenseNo",StandardBasicTypes.STRING).addScalar("PLicenseSrc",StandardBasicTypes.STRING).addScalar("PLicenseDeadline",StandardBasicTypes.STRING).addScalar("AEPCertificateNo",StandardBasicTypes.STRING).addScalar("AEPCertificateSrc",StandardBasicTypes.STRING).addScalar("TaxRCNo",StandardBasicTypes.STRING).addScalar("TaxRCSrc",StandardBasicTypes.STRING).addScalar("FoodDistributionLicenseNo",StandardBasicTypes.STRING).addScalar("FoodDistributionLicenseSrc",StandardBasicTypes.STRING).addScalar("FoodHygienePermitNo",StandardBasicTypes.STRING).addScalar("FoodHygienePermitSrc",StandardBasicTypes.STRING).addScalar("OrganizationCodeCertificateNo",StandardBasicTypes.STRING).addScalar("OrganizationCodeCertificateSrc",StandardBasicTypes.STRING).addScalar("RoadTransportBusinessLicenseNo",StandardBasicTypes.STRING).addScalar("RoadTransportBusinessLicenseSrc",StandardBasicTypes.STRING).addScalar("AnimalEpidemicPCNo",StandardBasicTypes.STRING).addScalar("AnimalEpidemicPCSrc",StandardBasicTypes.STRING).addScalar("SecretKeys",StandardBasicTypes.STRING).addScalar("PASSWORD",StandardBasicTypes.STRING).addScalar("Flag",StandardBasicTypes.STRING).addScalar("LoginName",StandardBasicTypes.STRING).setString(1,LoginName).list();
        Object[] elements=(Object[]) list.get(0);
        Map<String,Object> map=new HashMap<>();
        if(elements[0]!=null){
            map.put("CompanyID",elements[0]);
        }
        if(elements[1]!=null){
            map.put("CompanyName",elements[1]);
        }
        if(elements[2]!=null){
            map.put("CorporateName",elements[2]);
        }
        if(elements[3]!=null){
            map.put("CorporateIDNo",elements[3]);
        }
        if(elements[4]!=null){
            map.put("CorporateContactNo",elements[4]);
        }
        if(elements[5]!=null){
            map.put("RegisterTime",elements[5]);
        }
        if(elements[6]!=null){
            map.put("OperatingPlace",elements[6]);
        }
        if(elements[8]!=null){
            map.put("InvestigateRes",elements[8]);
        }
        if(elements[9]!=null){
            map.put("BLicenseRegisterNo",elements[9]);
        }

        if(elements[11]!=null){
            map.put("BLicenseDeadline",elements[11]);
        }
        if(elements[12]!=null){
            map.put("PLicenseNo",elements[12]);
        }
        if(elements[14]!=null){
            map.put("PLicenseDeadline",elements[14]);
        }
        if(elements[15]!=null){
            map.put("AEPCertificateNo",elements[15]);
        }
        if(elements[17]!=null){
            map.put("TaxRCNo",elements[17]);
        }
        if(elements[19]!=null){
            map.put("FoodDistributionLicenseNo",elements[19]);
        }
        if(elements[21]!=null){
            map.put("FoodHygienePermitNo",elements[21]);
        }
        if(elements[23]!=null){
            map.put("OrganizationCodeCertificateNo",elements[23]);
        }
        if(elements[25]!=null){
            map.put("RoadTransportBusinessLicenseNo",elements[25]);
        }
        if(elements[27]!=null){
            map.put("AnimalEpidemicPCNo",elements[27]);
        }
        if(elements[30]!=null){
            map.put("PASSWORD",elements[30]);
        }
        if(elements[31]!=null){
            map.put("Flag",elements[31]);
        }
        if(elements[32]!=null){
            map.put("LoginName",elements[32]);
        }










        map.put("BLicenseSrc","01");


        map.put("PLicenseSrc","02");


        map.put("AEPCertificateSrc","03");

        map.put("TaxRCSrc","04");

        map.put("FoodDistributionLicenseSrc","05");

        map.put("FoodHygienePermitSrc","06");

        map.put("OrganizationCodeCertificateSrc","07");

        map.put("RoadTransportBusinessLicenseSrc","08");

        map.put("AnimalEpidemicPCSrc","09");



        return map;
    }

    @Override
    public String check(String name, String password) {
        System.out.println(name + password);
        String sql="SELECT Password FROM app_companyregistry WHERE LoginName=?1";
        List list=sessionFactory.getCurrentSession().createSQLQuery(sql).addScalar("Password",StandardBasicTypes.STRING).setString(1,name).list();
        if(list.size()!=0){
            String s=(String)list.get(0);
            if(s.equals(password)){
                String sq="SELECT Flag FROM app_companyregistry WHERE LoginName=?1";
                List li=sessionFactory.getCurrentSession().createSQLQuery(sq).addScalar("Flag",StandardBasicTypes.STRING).setString(1,name).list();
                return (String)li.get(0);
            }else {
                return "error";
            }
        }
        return "error";
    }
}
