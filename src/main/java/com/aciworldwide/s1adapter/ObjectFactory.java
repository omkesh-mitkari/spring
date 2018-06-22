
package com.aciworldwide.s1adapter;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aciworldwide.s1adapter package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SignonRole_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SignonRole");
    private final static QName _SPName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SPName");
    private final static QName _CustPermId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CustPermId");
    private final static QName _CustLoginId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CustLoginId");
    private final static QName _CryptType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CryptType");
    private final static QName _Pswd_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Pswd");
    private final static QName _ContentType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ContentType");
    private final static QName _BinLength_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BinLength");
    private final static QName _BinData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BinData");
    private final static QName _GenSessKey_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenSessKey");
    private final static QName _SessKey_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SessKey");
    private final static QName _CustLangPref_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CustLangPref");
    private final static QName _Org_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Org");
    private final static QName _Name_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Name");
    private final static QName _Version_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Version");
    private final static QName _ClientDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ClientDt");
    private final static QName _SuppressEcho_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SuppressEcho");
    private final static QName _TunneledData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TunneledData");
    private final static QName _RqUID_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RqUID");
    private final static QName _AsyncRqUID_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AsyncRqUID");
    private final static QName _BankId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BankId");
    private final static QName _BankIdType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BankIdType");
    private final static QName _BranchId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BranchId");
    private final static QName _RefType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RefType");
    private final static QName _RefId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RefId");
    private final static QName _PostAddrType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PostAddrType");
    private final static QName _IsPreferredAddr_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IsPreferredAddr");
    private final static QName _Addr1_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Addr1");
    private final static QName _Addr2_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Addr2");
    private final static QName _Addr3_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Addr3");
    private final static QName _City_QNAME = new QName("http://aciworldwide.com/S1Adapter", "City");
    private final static QName _StateProv_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StateProv");
    private final static QName _PostalCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PostalCode");
    private final static QName _Country_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Country");
    private final static QName _County_QNAME = new QName("http://aciworldwide.com/S1Adapter", "County");
    private final static QName _Channel_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Channel");
    private final static QName _Affiliate_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Affiliate");
    private final static QName _AcctId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctId");
    private final static QName _AcctType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctType");
    private final static QName _AcctCur_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctCur");
    private final static QName _StatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StatusCode");
    private final static QName _ServerStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ServerStatusCode");
    private final static QName _Severity_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Severity");
    private final static QName _StatusDesc_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StatusDesc");
    private final static QName _AvailDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AvailDt");
    private final static QName _ExpDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ExpDt");
    private final static QName _ServerDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ServerDt");
    private final static QName _Language_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Language");
    private final static QName _AcctGenInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctGenInfo");
    private final static QName _AcctGenRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctGenRec");
    private final static QName _AcctKey_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctKey");
    private final static QName _NoteNumber_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NoteNumber");
    private final static QName _IncBal_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IncBal");
    private final static QName _IncExtBal_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IncExtBal");
    private final static QName _UpDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "UpDt");
    private final static QName _LastTrnDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "LastTrnDt");
    private final static QName _LastStmtDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "LastStmtDt");
    private final static QName _NextStmtDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NextStmtDt");
    private final static QName _StmtCycle_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StmtCycle");
    private final static QName _NumberOfSigners_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NumberOfSigners");
    private final static QName _Relationship_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Relationship");
    private final static QName _CurCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CurCode");
    private final static QName _Desc_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Desc");
    private final static QName _AccountTitle_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AccountTitle");
    private final static QName _Nickname_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Nickname");
    private final static QName _BankAcctStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BankAcctStatusCode");
    private final static QName _OpenDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OpenDt");
    private final static QName _CloseDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CloseDt");
    private final static QName _FlagName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FlagName");
    private final static QName _FlagValue_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FlagValue");
    private final static QName _BalType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BalType");
    private final static QName _Amt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Amt");
    private final static QName _EffDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "EffDt");
    private final static QName _ExtBalType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ExtBalType");
    private final static QName _LastDepDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "LastDepDt");
    private final static QName _DepMatureDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepMatureDt");
    private final static QName _NSFDetails_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NSFDetails");
    private final static QName _InterestDetails_QNAME = new QName("http://aciworldwide.com/S1Adapter", "InterestDetails");
    private final static QName _Count_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Count");
    private final static QName _TermUnits_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TermUnits");
    private final static QName _DaysCall_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DaysCall");
    private final static QName _DueDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DueDt");
    private final static QName _LastPmtDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "LastPmtDt");
    private final static QName _Rate_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Rate");
    private final static QName _MatDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MatDt");
    private final static QName _OrigDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OrigDt");
    private final static QName _PastDuePmtCount_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PastDuePmtCount");
    private final static QName _RemainingPmtCount_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RemainingPmtCount");
    private final static QName _Ownership_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Ownership");
    private final static QName _AcctComments_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctComments");
    private final static QName _OfficerId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OfficerId");
    private final static QName _CRAStateCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CRAStateCode");
    private final static QName _CRACountyCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CRACountyCode");
    private final static QName _CRACensusTract_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CRACensusTract");
    private final static QName _CRASMSACode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CRASMSACode");
    private final static QName _CRALoc_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CRALoc");
    private final static QName _CRAIncomeLvl_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CRAIncomeLvl");
    private final static QName _Reissue_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Reissue");
    private final static QName _DeactivationCause_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DeactivationCause");
    private final static QName _CardID_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CardID");
    private final static QName _CardType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CardType");
    private final static QName _CardClass_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CardClass");
    private final static QName _CardBaseID_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CardBaseID");
    private final static QName _CardProduct_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CardProduct");
    private final static QName _CardHolderID_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CardHolderID");
    private final static QName _CardHolderName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CardHolderName");
    private final static QName _CardExpirationDate_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CardExpirationDate");
    private final static QName _CardStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CardStatus");
    private final static QName _CustTaxID_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CustTaxID");
    private final static QName _RecordCount_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecordCount");
    private final static QName _DepositOnly_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepositOnly");
    private final static QName _BankAcctFeatType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BankAcctFeatType");
    private final static QName _FeatureEnabled_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FeatureEnabled");
    private final static QName _SelRangeDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SelRangeDt");
    private final static QName _ChkNumStart_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ChkNumStart");
    private final static QName _ChkNumEnd_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ChkNumEnd");
    private final static QName _TrnType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TrnType");
    private final static QName _DepositAmt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepositAmt");
    private final static QName _DebitAcct_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DebitAcct");
    private final static QName _PostedDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PostedDt");
    private final static QName _IndustNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IndustNum");
    private final static QName _Memo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Memo");
    private final static QName _FITID_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FITID");
    private final static QName _ChkNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ChkNum");
    private final static QName _CardNumber_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CardNumber");
    private final static QName _LoanTranBrkoutType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "LoanTranBrkoutType");
    private final static QName _UniqueImageId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "UniqueImageId");
    private final static QName _SideOfImage_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SideOfImage");
    private final static QName _Image_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Image");
    private final static QName _BillId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillId");
    private final static QName _BillerNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillerNum");
    private final static QName _BillType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillType");
    private final static QName _BillStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillStatusCode");
    private final static QName _BillPmtStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillPmtStatusCode");
    private final static QName _NotifyWilling_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NotifyWilling");
    private final static QName _IncCounts_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IncCounts");
    private final static QName _IncSummary_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IncSummary");
    private final static QName _DeliveryMethod_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DeliveryMethod");
    private final static QName _BillCounts_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillCounts");
    private final static QName _BillRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillRec");
    private final static QName _Phone_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Phone");
    private final static QName _IncBillerContact_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IncBillerContact");
    private final static QName _IncImages_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IncImages");
    private final static QName _NewUpDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NewUpDt");
    private final static QName _BillerRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillerRec");
    private final static QName _URL_QNAME = new QName("http://aciworldwide.com/S1Adapter", "URL");
    private final static QName _MostRecent_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MostRecent");
    private final static QName _All_QNAME = new QName("http://aciworldwide.com/S1Adapter", "All");
    private final static QName _StmtType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StmtType");
    private final static QName _SerialRange_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SerialRange");
    private final static QName _CheckStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CheckStatus");
    private final static QName _CheckBookId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CheckBookId");
    private final static QName _CreditAuthType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CreditAuthType");
    private final static QName _CompCurAmtId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CompCurAmtId");
    private final static QName _CompCurAmtType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CompCurAmtType");
    private final static QName _SpecialHandling_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SpecialHandling");
    private final static QName _CreditAuthId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CreditAuthId");
    private final static QName _CreditStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CreditStatusCode");
    private final static QName _StatusModBy_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StatusModBy");
    private final static QName _SecretId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SecretId");
    private final static QName _Secret_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Secret");
    private final static QName _TaxId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TaxId");
    private final static QName _CompanyID_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CompanyID");
    private final static QName _LastName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "LastName");
    private final static QName _FirstName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FirstName");
    private final static QName _MiddleName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MiddleName");
    private final static QName _TitlePrefix_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TitlePrefix");
    private final static QName _NameSuffix_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NameSuffix");
    private final static QName _DayPhone_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DayPhone");
    private final static QName _EvePhone_QNAME = new QName("http://aciworldwide.com/S1Adapter", "EvePhone");
    private final static QName _DayFax_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DayFax");
    private final static QName _EmailAddr_QNAME = new QName("http://aciworldwide.com/S1Adapter", "EmailAddr");
    private final static QName _CustType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CustType");
    private final static QName _CompanyName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CompanyName");
    private final static QName _ParentCompanyName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ParentCompanyName");
    private final static QName _BirthDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BirthDt");
    private final static QName _IdentificationInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IdentificationInfo");
    private final static QName _EmploymentHistory_QNAME = new QName("http://aciworldwide.com/S1Adapter", "EmploymentHistory");
    private final static QName _LegalName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "LegalName");
    private final static QName _ContactInfoType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ContactInfoType");
    private final static QName _ContactPref_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ContactPref");
    private final static QName _PrefTimeStart_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PrefTimeStart");
    private final static QName _PrefTimeEnd_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PrefTimeEnd");
    private final static QName _PhoneType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PhoneType");
    private final static QName _MerchantId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MerchantId");
    private final static QName _MerchantName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MerchantName");
    private final static QName _GlobalMerchant_QNAME = new QName("http://aciworldwide.com/S1Adapter", "globalMerchant");
    private final static QName _ContactType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ContactType");
    private final static QName _Fax_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Fax");
    private final static QName _OrgIdType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OrgIdType");
    private final static QName _OrgIdNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OrgIdNum");
    private final static QName _RemitName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RemitName");
    private final static QName _HistRetentionDays_QNAME = new QName("http://aciworldwide.com/S1Adapter", "HistRetentionDays");
    private final static QName _PmtInstType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PmtInstType");
    private final static QName _Brand_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Brand");
    private final static QName _SettlementMethod_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SettlementMethod");
    private final static QName _SettlementId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SettlementId");
    private final static QName _PmtFormat_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PmtFormat");
    private final static QName _SeqNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SeqNum");
    private final static QName _ChargeRegulation_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ChargeRegulation");
    private final static QName _FeeType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FeeType");
    private final static QName _SpecInstruction_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SpecInstruction");
    private final static QName _DaysToEPost_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DaysToEPost");
    private final static QName _PrenoteReqd_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PrenoteReqd");
    private final static QName _BillingAcct_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillingAcct");
    private final static QName _AcctPayAcctId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctPayAcctId");
    private final static QName _Category_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Category");
    private final static QName _CustPayeeId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CustPayeeId");
    private final static QName _CutOffTime_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CutOffTime");
    private final static QName _DaysToPay_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DaysToPay");
    private final static QName _CSPRefId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CSPRefId");
    private final static QName _SPRefId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SPRefId");
    private final static QName _CascadeDel_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CascadeDel");
    private final static QName _DependentType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DependentType");
    private final static QName _ModPending_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ModPending");
    private final static QName _MaxRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MaxRec");
    private final static QName _MatchedRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MatchedRec");
    private final static QName _SentRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SentRec");
    private final static QName _Token_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Token");
    private final static QName _NewToken_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NewToken");
    private final static QName _MsgRecDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MsgRecDt");
    private final static QName _PayeeType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PayeeType");
    private final static QName _SearchCriteria_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SearchCriteria");
    private final static QName _DebitAuthType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DebitAuthType");
    private final static QName _DebitAuthId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DebitAuthId");
    private final static QName _DebitStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DebitStatusCode");
    private final static QName _DepAppAddRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepAppAddRq");
    private final static QName _DepAppAddRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepAppAddRs");
    private final static QName _FileStatusInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FileStatusInfo");
    private final static QName _AdditionalFileStatusInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AdditionalFileStatusInfo");
    private final static QName _FileStatusRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FileStatusRec");
    private final static QName _MsgRqHdr_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MsgRqHdr");
    private final static QName _ForExDealInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExDealInfo");
    private final static QName _ForExDealId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExDealId");
    private final static QName _ForExRateAction_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExRateAction");
    private final static QName _ConvCurAmt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ConvCurAmt");
    private final static QName _CurRate_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CurRate");
    private final static QName _ForExRateType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExRateType");
    private final static QName _MsgRsHdr_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MsgRsHdr");
    private final static QName _ForExDealRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExDealRec");
    private final static QName _ValueDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ValueDt");
    private final static QName _PartnerRefId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartnerRefId");
    private final static QName _ForExOffsetRateInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExOffsetRateInfo");
    private final static QName _OffsetAmt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OffsetAmt");
    private final static QName _ForExRateId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExRateId");
    private final static QName _ForExRateDealType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExRateDealType");
    private final static QName _ForExDealMsgRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExDealMsgRec");
    private final static QName _ToCurCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ToCurCode");
    private final static QName _FromCurCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FromCurCode");
    private final static QName _ForExValDtType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExValDtType");
    private final static QName _CurConvertRule_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CurConvertRule");
    private final static QName _QuotedDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "QuotedDt");
    private final static QName _TranDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TranDt");
    private final static QName _ForExValDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExValDt");
    private final static QName _StartDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StartDt");
    private final static QName _EndDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "EndDt");
    private final static QName _CurCodeRates_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CurCodeRates");
    private final static QName _GenAppAddRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenAppAddRq");
    private final static QName _GenAppAddRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenAppAddRs");
    private final static QName _GenAppCanRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenAppCanRq");
    private final static QName _GenAppCanRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenAppCanRs");
    private final static QName _HostCustAddRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "HostCustAddRq");
    private final static QName _HostCustAddRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "HostCustAddRs");
    private final static QName _InterfaceVersion_QNAME = new QName("http://aciworldwide.com/S1Adapter", "InterfaceVersion");
    private final static QName _NoteRange_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NoteRange");
    private final static QName _CommitmentNumber_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CommitmentNumber");
    private final static QName _NextRateChangeDate_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NextRateChangeDate");
    private final static QName _DtRange_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DtRange");
    private final static QName _PartyAcctRelAddRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelAddRq");
    private final static QName _PartyAcctRelAddRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelAddRs");
    private final static QName _PartyAcctRelDelRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelDelRq");
    private final static QName _PartyAcctRelDelRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelDelRs");
    private final static QName _PartyAcctRelInqRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelInqRq");
    private final static QName _PartyAcctRelInqRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelInqRs");
    private final static QName _PartyAcctRelModRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelModRq");
    private final static QName _PartyAcctRelModRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelModRs");
    private final static QName _PayerInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PayerInfo");
    private final static QName _RemitRefId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RemitRefId");
    private final static QName _PmtRefId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PmtRefId");
    private final static QName _DeliveryInstruction_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DeliveryInstruction");
    private final static QName _OrgPhone_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OrgPhone");
    private final static QName _BillRefInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillRefInfo");
    private final static QName _PmtId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PmtId");
    private final static QName _BillSummAmtId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillSummAmtId");
    private final static QName _InvoiceType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "InvoiceType");
    private final static QName _InvoiceNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "InvoiceNum");
    private final static QName _InvoiceVouchNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "InvoiceVouchNum");
    private final static QName _TaxType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TaxType");
    private final static QName _InvoiceAdjNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "InvoiceAdjNum");
    private final static QName _AdjType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AdjType");
    private final static QName _InvoiceLineItemNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "InvoiceLineItemNum");
    private final static QName _AcctPayAcct_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctPayAcct");
    private final static QName _PayeeCountry_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PayeeCountry");
    private final static QName _PrcDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PrcDt");
    private final static QName _LegalRptCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "LegalRptCode");
    private final static QName _SupplRptCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SupplRptCode");
    private final static QName _SupplyingCountry_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SupplyingCountry");
    private final static QName _ImportDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ImportDt");
    private final static QName _ImmediatePmt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ImmediatePmt");
    private final static QName _RemittanceInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RemittanceInfo");
    private final static QName _DupChkOverride_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DupChkOverride");
    private final static QName _RecPmtId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecPmtId");
    private final static QName _PmtStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PmtStatusCode");
    private final static QName _PmtAuthId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PmtAuthId");
    private final static QName _RemitId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RemitId");
    private final static QName _RecPmtMod_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecPmtMod");
    private final static QName _PmtAuthCount_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PmtAuthCount");
    private final static QName _PmtMethod_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PmtMethod");
    private final static QName _CreatedDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CreatedDt");
    private final static QName _OrigPmtPrcDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OrigPmtPrcDt");
    private final static QName _OrigPmtDueDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OrigPmtDueDt");
    private final static QName _FIDebitTrcNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FIDebitTrcNum");
    private final static QName _FICreditTrcNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FICreditTrcNum");
    private final static QName _PmtInqRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PmtInqRq");
    private final static QName _PmtInqRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PmtInqRs");
    private final static QName _UpPayee_QNAME = new QName("http://aciworldwide.com/S1Adapter", "UpPayee");
    private final static QName _NetworkTrnInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NetworkTrnInfo");
    private final static QName _Freq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Freq");
    private final static QName _NumInsts_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NumInsts");
    private final static QName _FinalPrcDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FinalPrcDt");
    private final static QName _FinalDueDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FinalDueDt");
    private final static QName _NextPmtDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NextPmtDt");
    private final static QName _SkipNextN_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SkipNextN");
    private final static QName _RemainingInsts_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RemainingInsts");
    private final static QName _RecPmtInqRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecPmtInqRq");
    private final static QName _RecPmtInqRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecPmtInqRs");
    private final static QName _RecXferAddRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecXferAddRq");
    private final static QName _RecXferAddRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecXferAddRs");
    private final static QName _RecXferCanRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecXferCanRq");
    private final static QName _RecXferCanRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecXferCanRs");
    private final static QName _RecXferInqRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecXferInqRq");
    private final static QName _RecXferInqRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecXferInqRs");
    private final static QName _RecXferModRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecXferModRq");
    private final static QName _RecXferModRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecXferModRs");
    private final static QName _AcctMask_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctMask");
    private final static QName _MailDelivery_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MailDelivery");
    private final static QName _MailDeliveryStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MailDeliveryStatus");
    private final static QName _Comment_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Comment");
    private final static QName _StopChkStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StopChkStatusCode");
    private final static QName _QualifiedAmt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "QualifiedAmt");
    private final static QName _StopPayInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StopPayInfo");
    private final static QName _ACHCompanyId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ACHCompanyId");
    private final static QName _ACHStdEntryClass_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ACHStdEntryClass");
    private final static QName _ACHDrCRAll_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ACHDrCRAll");
    private final static QName _StopPayRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StopPayRec");
    private final static QName _StopPayUID_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StopPayUID");
    private final static QName _StopPayStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StopPayStatusCode");
    private final static QName _IncAccts_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IncAccts");
    private final static QName _IncDetail_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IncDetail");
    private final static QName _IncAdditDetail_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IncAdditDetail");
    private final static QName _XferDetail_QNAME = new QName("http://aciworldwide.com/S1Adapter", "XferDetail");
    private final static QName _XferId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "XferId");
    private final static QName _XferStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "XferStatusCode");
    private final static QName _XferCanRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "XferCanRq");
    private final static QName _XferCanRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "XferCanRs");
    private final static QName _XferInqRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "XferInqRq");
    private final static QName _XferInqRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "XferInqRs");
    private final static QName _XferModRq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "XferModRq");
    private final static QName _XferModRs_QNAME = new QName("http://aciworldwide.com/S1Adapter", "XferModRs");
    private final static QName _ChkClrDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ChkClrDt");
    private final static QName _IncHistory_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IncHistory");
    private final static QName _IncToken_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IncToken");
    private final static QName _PmtType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PmtType");
    private final static QName _RecXferId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecXferId");
    private final static QName _RecXferRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RecXferRec");
    private final static QName _SelRangeDueDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SelRangeDueDt");
    private final static QName _SelRangePrcDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SelRangePrcDt");
    private final static QName _ImageType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ImageType");
    private final static QName _OriginatingChannel_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OriginatingChannel");
    private final static QName _OriginatingApplication_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OriginatingApplication");
    private final static QName _AgentType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AgentType");
    private final static QName _AgentId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AgentId");
    private final static QName _AppICProf_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AppICProf");
    private final static QName _AppID_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AppID");
    private final static QName _AppPAN_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AppPAN");
    private final static QName _AppPANSeq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AppPANSeq");
    private final static QName _AppTrnCounter_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AppTrnCounter");
    private final static QName _AppVersionNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AppVersionNum");
    private final static QName _AuthAmt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AuthAmt");
    private final static QName _AuthRqCrypto_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AuthRqCrypto");
    private final static QName _AuthRsCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AuthRsCode");
    private final static QName _CertCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CertCode");
    private final static QName _Criteria_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Criteria");
    private final static QName _CriteriaDetails_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CriteriaDetails");
    private final static QName _CryptoInfoData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CryptoInfoData");
    private final static QName _CVMRslts_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CVMRslts");
    private final static QName _EMVRqData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "EMVRqData");
    private final static QName _EMVRsData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "EMVRsData");
    private final static QName _EMVTrnType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "EMVTrnType");
    private final static QName _Environment_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Environment");
    private final static QName _FullName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FullName");
    private final static QName _GenAppAcctId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenAppAcctId");
    private final static QName _GenAppId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenAppId");
    private final static QName _GenAppInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenAppInfo");
    private final static QName _GenApplicant_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenApplicant");
    private final static QName _GenApplicantAcctRel_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenApplicantAcctRel");
    private final static QName _GenAppRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenAppRec");
    private final static QName _GenAppStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenAppStatus");
    private final static QName _GenAppStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GenAppStatusCode");
    private final static QName _IdentCharacterData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IdentCharacterData");
    private final static QName _IdentType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IdentType");
    private final static QName _IdentProgramId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IdentProgramId");
    private final static QName _IdentReadMethod_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IdentReadMethod");
    private final static QName _IdentVerifyMethod_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IdentVerifyMethod");
    private final static QName _IdentVerifyEntity_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IdentVerifyEntity");
    private final static QName _IdentConditions_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IdentConditions");
    private final static QName _IdentVerifyResults_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IdentVerifyResults");
    private final static QName _IntCompMethod_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IntCompMethod");
    private final static QName _IntDistMethod_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IntDistMethod");
    private final static QName _IntPmtFreq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IntPmtFreq");
    private final static QName _IntXferDestAcct_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IntXferDestAcct");
    private final static QName _IssAppData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IssAppData");
    private final static QName _IssAuthData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IssAuthData");
    private final static QName _IssScriptData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IssScriptData");
    private final static QName _IssPostScriptData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IssPostScriptData");
    private final static QName _IssPreScriptData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IssPreScriptData");
    private final static QName _IssScriptCmd_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IssScriptCmd");
    private final static QName _IssScriptId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IssScriptId");
    private final static QName _MacValue_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MacValue");
    private final static QName _MacVariant_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MacVariant");
    private final static QName _MsgAuthCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MsgAuthCode");
    private final static QName _NSFCountYTD_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NSFCountYTD");
    private final static QName _LastNSFDate_QNAME = new QName("http://aciworldwide.com/S1Adapter", "LastNSFDate");
    private final static QName _LastNSFAmt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "LastNSFAmt");
    private final static QName _OrigIssueDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OrigIssueDt");
    private final static QName _OwnerPercent_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OwnerPercent");
    private final static QName _OwnerInd_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OwnerInd");
    private final static QName _OpenAcctInd_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OpenAcctInd");
    private final static QName _PrimaryOwner_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PrimaryOwner");
    private final static QName _PartyAcctRel_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRel");
    private final static QName _PartyAcctRelDesc_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelDesc");
    private final static QName _PartyAcctRelInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelInfo");
    private final static QName _PartyAcctRelId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelId");
    private final static QName _PartyAcctRelRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelRec");
    private final static QName _PartyAcctRelStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelStatusCode");
    private final static QName _PartyAcctRelStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelStatus");
    private final static QName _PartyAcctRelType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelType");
    private final static QName _PartyAcctRelSubType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartyAcctRelSubType");
    private final static QName _PointOfServiceData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PointOfServiceData");
    private final static QName _POSLocation_QNAME = new QName("http://aciworldwide.com/S1Adapter", "POSLocation");
    private final static QName _POSSecurity_QNAME = new QName("http://aciworldwide.com/S1Adapter", "POSSecurity");
    private final static QName _POSCapabilities_QNAME = new QName("http://aciworldwide.com/S1Adapter", "POSCapabilities");
    private final static QName _POSAgent_QNAME = new QName("http://aciworldwide.com/S1Adapter", "POSAgent");
    private final static QName _POSAttended_QNAME = new QName("http://aciworldwide.com/S1Adapter", "POSAttended");
    private final static QName _POSOperation_QNAME = new QName("http://aciworldwide.com/S1Adapter", "POSOperation");
    private final static QName _POSEntryCapability_QNAME = new QName("http://aciworldwide.com/S1Adapter", "POSEntryCapability");
    private final static QName _POSCaptureCapability_QNAME = new QName("http://aciworldwide.com/S1Adapter", "POSCaptureCapability");
    private final static QName _POSVerifyCapability_QNAME = new QName("http://aciworldwide.com/S1Adapter", "POSVerifyCapability");
    private final static QName _POSOutCapabilities_QNAME = new QName("http://aciworldwide.com/S1Adapter", "POSOutCapabilities");
    private final static QName _PrimaryAcct_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PrimaryAcct");
    private final static QName _PSSNetworkType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PSSNetworkType");
    private final static QName _PSSMsgMAC_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PSSMsgMAC");
    private final static QName _PSSMsgEncryption_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PSSMsgEncryption");
    private final static QName _PSSCATSecLevel_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PSSCATSecLevel");
    private final static QName _PswdDelivery_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PswdDelivery");
    private final static QName _SecAmt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SecAmt");
    private final static QName _SecObjId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SecObjId");
    private final static QName _ServerTerminalSeqId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ServerTerminalSeqId");
    private final static QName _TerminalCaps_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TerminalCaps");
    private final static QName _TerminalCountryCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TerminalCountryCode");
    private final static QName _TerminalVrfyRslt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TerminalVrfyRslt");
    private final static QName _TINInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TINInfo");
    private final static QName _TINType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TINType");
    private final static QName _Trk2EquivData_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Trk2EquivData");
    private final static QName _TrnDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TrnDt");
    private final static QName _TrnStatInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TrnStatInfo");
    private final static QName _UnpredictNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "UnpredictNum");
    private final static QName _ModPendingType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ModPendingType");
    private final static QName _NetworkOwner_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NetworkOwner");
    private final static QName _TerminalId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TerminalId");
    private final static QName _NetworkRefId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NetworkRefId");
    private final static QName _OriginatorName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OriginatorName");
    private final static QName _SvcRqUID_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SvcRqUID");
    private final static QName _DepAppInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepAppInfo");
    private final static QName _DepAppAcctId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepAppAcctId");
    private final static QName _DepAppRec_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepAppRec");
    private final static QName _DepAppId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepAppId");
    private final static QName _DepAppStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepAppStatus");
    private final static QName _DepAppStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepAppStatusCode");
    private final static QName _DepApplicant_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepApplicant");
    private final static QName _DepApplicantAcctRel_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DepApplicantAcctRel");
    private final static QName _OverdraftFunding_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OverdraftFunding");
    private final static QName _FundingPriority_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FundingPriority");
    private final static QName _FundingInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FundingInfo");
    private final static QName _AmtQualifier_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AmtQualifier");
    private final static QName _SerialNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SerialNum");
    private final static QName _SerialNumEnd_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SerialNumEnd");
    private final static QName _SerialNumStart_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SerialNumStart");
    private final static QName _FindContact_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FindContact");
    private final static QName _FindOrg_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FindOrg");
    private final static QName _FindAll_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FindAll");
    private final static QName _SrchOperator_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SrchOperator");
    private final static QName _Value_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Value");
    private final static QName _DetailType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DetailType");
    private final static QName _Requestor_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Requestor");
    private final static QName _NoteNumStart_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NoteNumStart");
    private final static QName _NoteNumEnd_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NoteNumEnd");
    private final static QName _DriversLicense_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DriversLicense");
    private final static QName _EmploymentStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "EmploymentStatus");
    private final static QName _Income_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Income");
    private final static QName _JobTitle_QNAME = new QName("http://aciworldwide.com/S1Adapter", "JobTitle");
    private final static QName _LicenseNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "LicenseNum");
    private final static QName _NameAddrType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NameAddrType");
    private final static QName _Occupation_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Occupation");
    private final static QName _PassportCountry_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PassportCountry");
    private final static QName _PassportNumber_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PassportNumber");
    private final static QName _PersonName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PersonName");
    private final static QName _Passport_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Passport");
    private final static QName _StateId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StateId");
    private final static QName _IssDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IssDt");
    private final static QName _IssueLoc_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IssueLoc");
    private final static QName _StateNumber_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StateNumber");
    private final static QName _ItemType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ItemType");
    private final static QName _RelatedRmtInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RelatedRmtInfo");
    private final static QName _UnstructRmtInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "UnstructRmtInfo");
    private final static QName _StructRmtInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StructRmtInfo");
    private final static QName _AmtPaid_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AmtPaid");
    private final static QName _InvoiceAmt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "InvoiceAmt");
    private final static QName _DiscountAmt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DiscountAmt");
    private final static QName _AdjustmentInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AdjustmentInfo");
    private final static QName _SecondaryRmtDocInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SecondaryRmtDocInfo");
    private final static QName _RmtFreeText_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RmtFreeText");
    private final static QName _PrimaryRmtDocInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PrimaryRmtDocInfo");
    private final static QName _RmtOrigInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RmtOrigInfo");
    private final static QName _RmtBnfInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RmtBnfInfo");
    private final static QName _RmtDocDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RmtDocDt");
    private final static QName _ForExDealStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExDealStatus");
    private final static QName _ForExDealStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExDealStatusCode");
    private final static QName _RateType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "RateType");
    private final static QName _BuyRates_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BuyRates");
    private final static QName _SellRates_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SellRates");
    private final static QName _PersonInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PersonInfo");
    private final static QName _Dependents_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Dependents");
    private final static QName _Gender_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Gender");
    private final static QName _MaritalStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MaritalStatus");
    private final static QName _MotherMaidenName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "MotherMaidenName");
    private final static QName _OEDCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OEDCode");
    private final static QName _OEDInstitution_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OEDInstitution");
    private final static QName _SpouseName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SpouseName");
    private final static QName _USAMilitaryRank_QNAME = new QName("http://aciworldwide.com/S1Adapter", "USA.MilitaryRank");
    private final static QName _OffsetId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OffsetId");
    private final static QName _OffsetPmtId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OffsetPmtId");
    private final static QName _ContractBalance_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ContractBalance");
    private final static QName _ForExDealSyncObj_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ForExDealSyncObj");
    private final static QName _SettlementSummary_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SettlementSummary");
    private final static QName _Destination_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Destination");
    private final static QName _ISN_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ISN");
    private final static QName _Field20_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Field20");
    private final static QName _DraftPdInd_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DraftPdInd");
    private final static QName _DrawdownSeqNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DrawdownSeqNum");
    private final static QName _GovIssueIdent_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GovIssueIdent");
    private final static QName _GovOrgName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GovOrgName");
    private final static QName _GovRank_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GovRank");
    private final static QName _GovIssueIdentType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GovIssueIdentType");
    private final static QName _GovOrg_QNAME = new QName("http://aciworldwide.com/S1Adapter", "GovOrg");
    private final static QName _IdentSerialNum_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IdentSerialNum");
    private final static QName _OtherIdentDoc_QNAME = new QName("http://aciworldwide.com/S1Adapter", "OtherIdentDoc");
    private final static QName _Issuer_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Issuer");
    private final static QName _FileContent_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FileContent");
    private final static QName _FileHashType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FileHashType");
    private final static QName _FileHashValue_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FileHashValue");
    private final static QName _FileName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FileName");
    private final static QName _FileNumber_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FileNumber");
    private final static QName _HostFileNumber_QNAME = new QName("http://aciworldwide.com/S1Adapter", "HostFileNumber");
    private final static QName _FileType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FileType");
    private final static QName _EventName_QNAME = new QName("http://aciworldwide.com/S1Adapter", "EventName");
    private final static QName _TransSucceded_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TransSucceded");
    private final static QName _TransFailed_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TransFailed");
    private final static QName _TransSkipped_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TransSkipped");
    private final static QName _PartnerId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PartnerId");
    private final static QName _TotalTransactions_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TotalTransactions");
    private final static QName _TransProccessed_QNAME = new QName("http://aciworldwide.com/S1Adapter", "TransProccessed");
    private final static QName _FileStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FileStatus");
    private final static QName _FullBillerListURL_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FullBillerListURL");
    private final static QName _BSPReferTo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BSPReferTo");
    private final static QName _BillerInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillerInfo");
    private final static QName _BillerAcctIdInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillerAcctIdInfo");
    private final static QName _AcctFormat_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctFormat");
    private final static QName _AcctHelpMsg_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctHelpMsg");
    private final static QName _AcctRestrictMsg_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctRestrictMsg");
    private final static QName _AcctValidateURL_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AcctValidateURL");
    private final static QName _BillerEnrollURL_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillerEnrollURL");
    private final static QName _BillerStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillerStatus");
    private final static QName _BillerStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillerStatusCode");
    private final static QName _CSPCustInfoReq_QNAME = new QName("http://aciworldwide.com/S1Adapter", "CSPCustInfoReq");
    private final static QName _DiscDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DiscDt");
    private final static QName _DiscId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DiscId");
    private final static QName _DiscReqd_QNAME = new QName("http://aciworldwide.com/S1Adapter", "DiscReqd");
    private final static QName _Logo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Logo");
    private final static QName _LogoURL_QNAME = new QName("http://aciworldwide.com/S1Adapter", "LogoURL");
    private final static QName _SecretPrompt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SecretPrompt");
    private final static QName _Prompt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "Prompt");
    private final static QName _SecretFormat_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SecretFormat");
    private final static QName _SecretMask_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SecretMask");
    private final static QName _SecretOptional_QNAME = new QName("http://aciworldwide.com/S1Adapter", "SecretOptional");
    private final static QName _IndustInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "IndustInfo");
    private final static QName _FileStatusCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "FileStatusCode");
    private final static QName _AllocateAllowed_QNAME = new QName("http://aciworldwide.com/S1Adapter", "AllocateAllowed");
    private final static QName _BillInfo_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillInfo");
    private final static QName _BillSummAmt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillSummAmt");
    private final static QName _BillSummAmtType_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillSummAmtType");
    private final static QName _BillSummSubAmt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillSummSubAmt");
    private final static QName _BillSummAmtCode_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillSummAmtCode");
    private final static QName _BillPmtStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillPmtStatus");
    private final static QName _BillStatus_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillStatus");
    private final static QName _BillPmtStatusCounts_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillPmtStatusCounts");
    private final static QName _BillStatusCounts_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillStatusCounts");
    private final static QName _BillDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "BillDt");
    private final static QName _ImageURL_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ImageURL");
    private final static QName _NotifyReqd_QNAME = new QName("http://aciworldwide.com/S1Adapter", "NotifyReqd");
    private final static QName _EarliestPmtDt_QNAME = new QName("http://aciworldwide.com/S1Adapter", "EarliestPmtDt");
    private final static QName _PmtPeriod_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PmtPeriod");
    private final static QName _PresAcctId_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PresAcctId");
    private final static QName _PrefetchURL_QNAME = new QName("http://aciworldwide.com/S1Adapter", "PrefetchURL");
    private final static QName _ShortDesc_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ShortDesc");
    private final static QName _StmtImage_QNAME = new QName("http://aciworldwide.com/S1Adapter", "StmtImage");
    private final static QName _ViewDtlPref_QNAME = new QName("http://aciworldwide.com/S1Adapter", "ViewDtlPref");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aciworldwide.s1adapter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustInqRs }
     * 
     */
    public CustInqRs createCustInqRs() {
        return new CustInqRs();
    }

    /**
     * Create an instance of {@link LoanNoteRec }
     * 
     */
    public LoanNoteRec createLoanNoteRec() {
        return new LoanNoteRec();
    }

    /**
     * Create an instance of {@link LoanNoteBillRec }
     * 
     */
    public LoanNoteBillRec createLoanNoteBillRec() {
        return new LoanNoteBillRec();
    }

    /**
     * Create an instance of {@link LoanAcctNoteHistoryDetailRec }
     * 
     */
    public LoanAcctNoteHistoryDetailRec createLoanAcctNoteHistoryDetailRec() {
        return new LoanAcctNoteHistoryDetailRec();
    }

    /**
     * Create an instance of {@link AcctAddrModInp }
     * 
     */
    public AcctAddrModInp createAcctAddrModInp() {
        return new AcctAddrModInp();
    }

    /**
     * Create an instance of {@link SignonRq }
     * 
     */
    public SignonRq createSignonRq() {
        return new SignonRq();
    }

    /**
     * Create an instance of {@link SignonPswd }
     * 
     */
    public SignonPswd createSignonPswd() {
        return new SignonPswd();
    }

    /**
     * Create an instance of {@link CustId }
     * 
     */
    public CustId createCustId() {
        return new CustId();
    }

    /**
     * Create an instance of {@link CustPswd }
     * 
     */
    public CustPswd createCustPswd() {
        return new CustPswd();
    }

    /**
     * Create an instance of {@link CryptPswd }
     * 
     */
    public CryptPswd createCryptPswd() {
        return new CryptPswd();
    }

    /**
     * Create an instance of {@link Binary }
     * 
     */
    public Binary createBinary() {
        return new Binary();
    }

    /**
     * Create an instance of {@link ClientApp }
     * 
     */
    public ClientApp createClientApp() {
        return new ClientApp();
    }

    /**
     * Create an instance of {@link ClientAppType }
     * 
     */
    public ClientAppType createClientAppType() {
        return new ClientAppType();
    }

    /**
     * Create an instance of {@link MapElement }
     * 
     */
    public MapElement createMapElement() {
        return new MapElement();
    }

    /**
     * Create an instance of {@link AcctAddrModRq }
     * 
     */
    public AcctAddrModRq createAcctAddrModRq() {
        return new AcctAddrModRq();
    }

    /**
     * Create an instance of {@link RouteInfo }
     * 
     */
    public RouteInfo createRouteInfo() {
        return new RouteInfo();
    }

    /**
     * Create an instance of {@link BankInfo }
     * 
     */
    public BankInfo createBankInfo() {
        return new BankInfo();
    }

    /**
     * Create an instance of {@link RefInfo }
     * 
     */
    public RefInfo createRefInfo() {
        return new RefInfo();
    }

    /**
     * Create an instance of {@link PostAddr }
     * 
     */
    public PostAddr createPostAddr() {
        return new PostAddr();
    }

    /**
     * Create an instance of {@link PostAddrType }
     * 
     */
    public PostAddrType createPostAddrType() {
        return new PostAddrType();
    }

    /**
     * Create an instance of {@link AcctAddrModOut }
     * 
     */
    public AcctAddrModOut createAcctAddrModOut() {
        return new AcctAddrModOut();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link AsyncRsInfo }
     * 
     */
    public AsyncRsInfo createAsyncRsInfo() {
        return new AsyncRsInfo();
    }

    /**
     * Create an instance of {@link SignonRs }
     * 
     */
    public SignonRs createSignonRs() {
        return new SignonRs();
    }

    /**
     * Create an instance of {@link AcctAddrModRs }
     * 
     */
    public AcctAddrModRs createAcctAddrModRs() {
        return new AcctAddrModRs();
    }

    /**
     * Create an instance of {@link AcctAddrSrchInp }
     * 
     */
    public AcctAddrSrchInp createAcctAddrSrchInp() {
        return new AcctAddrSrchInp();
    }

    /**
     * Create an instance of {@link AcctAddrSrchRq }
     * 
     */
    public AcctAddrSrchRq createAcctAddrSrchRq() {
        return new AcctAddrSrchRq();
    }

    /**
     * Create an instance of {@link AcctAddrSrchOut }
     * 
     */
    public AcctAddrSrchOut createAcctAddrSrchOut() {
        return new AcctAddrSrchOut();
    }

    /**
     * Create an instance of {@link AcctAddrSrchRs }
     * 
     */
    public AcctAddrSrchRs createAcctAddrSrchRs() {
        return new AcctAddrSrchRs();
    }

    /**
     * Create an instance of {@link AcctNumGenInp }
     * 
     */
    public AcctNumGenInp createAcctNumGenInp() {
        return new AcctNumGenInp();
    }

    /**
     * Create an instance of {@link AcctNumGenRq }
     * 
     */
    public AcctNumGenRq createAcctNumGenRq() {
        return new AcctNumGenRq();
    }

    /**
     * Create an instance of {@link AcctGenInfoType }
     * 
     */
    public AcctGenInfoType createAcctGenInfoType() {
        return new AcctGenInfoType();
    }

    /**
     * Create an instance of {@link AcctNumGenOut }
     * 
     */
    public AcctNumGenOut createAcctNumGenOut() {
        return new AcctNumGenOut();
    }

    /**
     * Create an instance of {@link AcctNumGenRs }
     * 
     */
    public AcctNumGenRs createAcctNumGenRs() {
        return new AcctNumGenRs();
    }

    /**
     * Create an instance of {@link AcctGenRecType }
     * 
     */
    public AcctGenRecType createAcctGenRecType() {
        return new AcctGenRecType();
    }

    /**
     * Create an instance of {@link AcctInqInp }
     * 
     */
    public AcctInqInp createAcctInqInp() {
        return new AcctInqInp();
    }

    /**
     * Create an instance of {@link AcctInqRq }
     * 
     */
    public AcctInqRq createAcctInqRq() {
        return new AcctInqRq();
    }

    /**
     * Create an instance of {@link DepAcctId }
     * 
     */
    public DepAcctId createDepAcctId() {
        return new DepAcctId();
    }

    /**
     * Create an instance of {@link DepAcctIdType }
     * 
     */
    public DepAcctIdType createDepAcctIdType() {
        return new DepAcctIdType();
    }

    /**
     * Create an instance of {@link CardAcctId }
     * 
     */
    public CardAcctId createCardAcctId() {
        return new CardAcctId();
    }

    /**
     * Create an instance of {@link CardAcctIdType }
     * 
     */
    public CardAcctIdType createCardAcctIdType() {
        return new CardAcctIdType();
    }

    /**
     * Create an instance of {@link LoanAcctId }
     * 
     */
    public LoanAcctId createLoanAcctId() {
        return new LoanAcctId();
    }

    /**
     * Create an instance of {@link LoanAcctIdType }
     * 
     */
    public LoanAcctIdType createLoanAcctIdType() {
        return new LoanAcctIdType();
    }

    /**
     * Create an instance of {@link AcctInqOut }
     * 
     */
    public AcctInqOut createAcctInqOut() {
        return new AcctInqOut();
    }

    /**
     * Create an instance of {@link AcctInqRs }
     * 
     */
    public AcctInqRs createAcctInqRs() {
        return new AcctInqRs();
    }

    /**
     * Create an instance of {@link BankAcctRec }
     * 
     */
    public BankAcctRec createBankAcctRec() {
        return new BankAcctRec();
    }

    /**
     * Create an instance of {@link BankAcctInfo }
     * 
     */
    public BankAcctInfo createBankAcctInfo() {
        return new BankAcctInfo();
    }

    /**
     * Create an instance of {@link BankAcctStatus }
     * 
     */
    public BankAcctStatus createBankAcctStatus() {
        return new BankAcctStatus();
    }

    /**
     * Create an instance of {@link AccountFlags }
     * 
     */
    public AccountFlags createAccountFlags() {
        return new AccountFlags();
    }

    /**
     * Create an instance of {@link AcctBal }
     * 
     */
    public AcctBal createAcctBal() {
        return new AcctBal();
    }

    /**
     * Create an instance of {@link CurAmt }
     * 
     */
    public CurAmt createCurAmt() {
        return new CurAmt();
    }

    /**
     * Create an instance of {@link CurrencyAmount }
     * 
     */
    public CurrencyAmount createCurrencyAmount() {
        return new CurrencyAmount();
    }

    /**
     * Create an instance of {@link ExtAcctBal }
     * 
     */
    public ExtAcctBal createExtAcctBal() {
        return new ExtAcctBal();
    }

    /**
     * Create an instance of {@link DepAcctRec }
     * 
     */
    public DepAcctRec createDepAcctRec() {
        return new DepAcctRec();
    }

    /**
     * Create an instance of {@link LastDepCurAmt }
     * 
     */
    public LastDepCurAmt createLastDepCurAmt() {
        return new LastDepCurAmt();
    }

    /**
     * Create an instance of {@link NSFDetailsType }
     * 
     */
    public NSFDetailsType createNSFDetailsType() {
        return new NSFDetailsType();
    }

    /**
     * Create an instance of {@link InterestDetailsType }
     * 
     */
    public InterestDetailsType createInterestDetailsType() {
        return new InterestDetailsType();
    }

    /**
     * Create an instance of {@link Term }
     * 
     */
    public Term createTerm() {
        return new Term();
    }

    /**
     * Create an instance of {@link CCAcctRec }
     * 
     */
    public CCAcctRec createCCAcctRec() {
        return new CCAcctRec();
    }

    /**
     * Create an instance of {@link LastPmtCurAmt }
     * 
     */
    public LastPmtCurAmt createLastPmtCurAmt() {
        return new LastPmtCurAmt();
    }

    /**
     * Create an instance of {@link LoanAcctRec }
     * 
     */
    public LoanAcctRec createLoanAcctRec() {
        return new LoanAcctRec();
    }

    /**
     * Create an instance of {@link LoanInfoCommon }
     * 
     */
    public LoanInfoCommon createLoanInfoCommon() {
        return new LoanInfoCommon();
    }

    /**
     * Create an instance of {@link RegPmtCurAmt }
     * 
     */
    public RegPmtCurAmt createRegPmtCurAmt() {
        return new RegPmtCurAmt();
    }

    /**
     * Create an instance of {@link NextPmtCurAmt }
     * 
     */
    public NextPmtCurAmt createNextPmtCurAmt() {
        return new NextPmtCurAmt();
    }

    /**
     * Create an instance of {@link PastDuePmtAmt }
     * 
     */
    public PastDuePmtAmt createPastDuePmtAmt() {
        return new PastDuePmtAmt();
    }

    /**
     * Create an instance of {@link NextPrincipalPmtCurAmt }
     * 
     */
    public NextPrincipalPmtCurAmt createNextPrincipalPmtCurAmt() {
        return new NextPrincipalPmtCurAmt();
    }

    /**
     * Create an instance of {@link NextInterestPmtCurAmt }
     * 
     */
    public NextInterestPmtCurAmt createNextInterestPmtCurAmt() {
        return new NextInterestPmtCurAmt();
    }

    /**
     * Create an instance of {@link NextEscPmtCurAmt }
     * 
     */
    public NextEscPmtCurAmt createNextEscPmtCurAmt() {
        return new NextEscPmtCurAmt();
    }

    /**
     * Create an instance of {@link CRARec }
     * 
     */
    public CRARec createCRARec() {
        return new CRARec();
    }

    /**
     * Create an instance of {@link CRARecType }
     * 
     */
    public CRARecType createCRARecType() {
        return new CRARecType();
    }

    /**
     * Create an instance of {@link ATMCardDeactivateInp }
     * 
     */
    public ATMCardDeactivateInp createATMCardDeactivateInp() {
        return new ATMCardDeactivateInp();
    }

    /**
     * Create an instance of {@link ATMCardDeactivateRq }
     * 
     */
    public ATMCardDeactivateRq createATMCardDeactivateRq() {
        return new ATMCardDeactivateRq();
    }

    /**
     * Create an instance of {@link ATMCardRec }
     * 
     */
    public ATMCardRec createATMCardRec() {
        return new ATMCardRec();
    }

    /**
     * Create an instance of {@link ATMCardDeactivateOut }
     * 
     */
    public ATMCardDeactivateOut createATMCardDeactivateOut() {
        return new ATMCardDeactivateOut();
    }

    /**
     * Create an instance of {@link ATMCardDeactivateRs }
     * 
     */
    public ATMCardDeactivateRs createATMCardDeactivateRs() {
        return new ATMCardDeactivateRs();
    }

    /**
     * Create an instance of {@link ATMCardListInp }
     * 
     */
    public ATMCardListInp createATMCardListInp() {
        return new ATMCardListInp();
    }

    /**
     * Create an instance of {@link ATMCardListRq }
     * 
     */
    public ATMCardListRq createATMCardListRq() {
        return new ATMCardListRq();
    }

    /**
     * Create an instance of {@link ATMCardListOut }
     * 
     */
    public ATMCardListOut createATMCardListOut() {
        return new ATMCardListOut();
    }

    /**
     * Create an instance of {@link ATMCardListRs }
     * 
     */
    public ATMCardListRs createATMCardListRs() {
        return new ATMCardListRs();
    }

    /**
     * Create an instance of {@link BankAcctAuthInqInp }
     * 
     */
    public BankAcctAuthInqInp createBankAcctAuthInqInp() {
        return new BankAcctAuthInqInp();
    }

    /**
     * Create an instance of {@link BankAcctAuthInqRq }
     * 
     */
    public BankAcctAuthInqRq createBankAcctAuthInqRq() {
        return new BankAcctAuthInqRq();
    }

    /**
     * Create an instance of {@link BankAcctAuthInqOut }
     * 
     */
    public BankAcctAuthInqOut createBankAcctAuthInqOut() {
        return new BankAcctAuthInqOut();
    }

    /**
     * Create an instance of {@link BankAcctAuthInqRs }
     * 
     */
    public BankAcctAuthInqRs createBankAcctAuthInqRs() {
        return new BankAcctAuthInqRs();
    }

    /**
     * Create an instance of {@link BankAcctAuthRec }
     * 
     */
    public BankAcctAuthRec createBankAcctAuthRec() {
        return new BankAcctAuthRec();
    }

    /**
     * Create an instance of {@link BankAcctFeatSupt }
     * 
     */
    public BankAcctFeatSupt createBankAcctFeatSupt() {
        return new BankAcctFeatSupt();
    }

    /**
     * Create an instance of {@link BankAcctImgSrchInp }
     * 
     */
    public BankAcctImgSrchInp createBankAcctImgSrchInp() {
        return new BankAcctImgSrchInp();
    }

    /**
     * Create an instance of {@link BankAcctImgSrchRq }
     * 
     */
    public BankAcctImgSrchRq createBankAcctImgSrchRq() {
        return new BankAcctImgSrchRq();
    }

    /**
     * Create an instance of {@link SelRangeDtType }
     * 
     */
    public SelRangeDtType createSelRangeDtType() {
        return new SelRangeDtType();
    }

    /**
     * Create an instance of {@link SelRangeCurAmt }
     * 
     */
    public SelRangeCurAmt createSelRangeCurAmt() {
        return new SelRangeCurAmt();
    }

    /**
     * Create an instance of {@link LowCurAmt }
     * 
     */
    public LowCurAmt createLowCurAmt() {
        return new LowCurAmt();
    }

    /**
     * Create an instance of {@link HighCurAmt }
     * 
     */
    public HighCurAmt createHighCurAmt() {
        return new HighCurAmt();
    }

    /**
     * Create an instance of {@link ChkRange }
     * 
     */
    public ChkRange createChkRange() {
        return new ChkRange();
    }

    /**
     * Create an instance of {@link AccountsType }
     * 
     */
    public AccountsType createAccountsType() {
        return new AccountsType();
    }

    /**
     * Create an instance of {@link BankAcctImgSrchOut }
     * 
     */
    public BankAcctImgSrchOut createBankAcctImgSrchOut() {
        return new BankAcctImgSrchOut();
    }

    /**
     * Create an instance of {@link BankAcctImgSrchRs }
     * 
     */
    public BankAcctImgSrchRs createBankAcctImgSrchRs() {
        return new BankAcctImgSrchRs();
    }

    /**
     * Create an instance of {@link BankAcctImgSrchRec }
     * 
     */
    public BankAcctImgSrchRec createBankAcctImgSrchRec() {
        return new BankAcctImgSrchRec();
    }

    /**
     * Create an instance of {@link BankAcctTrnImgInfo }
     * 
     */
    public BankAcctTrnImgInfo createBankAcctTrnImgInfo() {
        return new BankAcctTrnImgInfo();
    }

    /**
     * Create an instance of {@link DepAcctTrnRec }
     * 
     */
    public DepAcctTrnRec createDepAcctTrnRec() {
        return new DepAcctTrnRec();
    }

    /**
     * Create an instance of {@link BankAcctTrnRec }
     * 
     */
    public BankAcctTrnRec createBankAcctTrnRec() {
        return new BankAcctTrnRec();
    }

    /**
     * Create an instance of {@link OrigCurAmt }
     * 
     */
    public OrigCurAmt createOrigCurAmt() {
        return new OrigCurAmt();
    }

    /**
     * Create an instance of {@link IndustId }
     * 
     */
    public IndustId createIndustId() {
        return new IndustId();
    }

    /**
     * Create an instance of {@link LoanAcctTrnRec }
     * 
     */
    public LoanAcctTrnRec createLoanAcctTrnRec() {
        return new LoanAcctTrnRec();
    }

    /**
     * Create an instance of {@link LoanTranBrkout }
     * 
     */
    public LoanTranBrkout createLoanTranBrkout() {
        return new LoanTranBrkout();
    }

    /**
     * Create an instance of {@link LoanTranBrkoutAmt }
     * 
     */
    public LoanTranBrkoutAmt createLoanTranBrkoutAmt() {
        return new LoanTranBrkoutAmt();
    }

    /**
     * Create an instance of {@link CCAcctTrnRec }
     * 
     */
    public CCAcctTrnRec createCCAcctTrnRec() {
        return new CCAcctTrnRec();
    }

    /**
     * Create an instance of {@link BankAcctTrnImgInqInp }
     * 
     */
    public BankAcctTrnImgInqInp createBankAcctTrnImgInqInp() {
        return new BankAcctTrnImgInqInp();
    }

    /**
     * Create an instance of {@link BankAcctTrnImgInqRq }
     * 
     */
    public BankAcctTrnImgInqRq createBankAcctTrnImgInqRq() {
        return new BankAcctTrnImgInqRq();
    }

    /**
     * Create an instance of {@link BankAcctTrnImgInqOut }
     * 
     */
    public BankAcctTrnImgInqOut createBankAcctTrnImgInqOut() {
        return new BankAcctTrnImgInqOut();
    }

    /**
     * Create an instance of {@link BankAcctTrnImgInqRs }
     * 
     */
    public BankAcctTrnImgInqRs createBankAcctTrnImgInqRs() {
        return new BankAcctTrnImgInqRs();
    }

    /**
     * Create an instance of {@link ImageType }
     * 
     */
    public ImageType createImageType() {
        return new ImageType();
    }

    /**
     * Create an instance of {@link BalInqInp }
     * 
     */
    public BalInqInp createBalInqInp() {
        return new BalInqInp();
    }

    /**
     * Create an instance of {@link BalInqRq }
     * 
     */
    public BalInqRq createBalInqRq() {
        return new BalInqRq();
    }

    /**
     * Create an instance of {@link BalInqOut }
     * 
     */
    public BalInqOut createBalInqOut() {
        return new BalInqOut();
    }

    /**
     * Create an instance of {@link BalInqRs }
     * 
     */
    public BalInqRs createBalInqRs() {
        return new BalInqRs();
    }

    /**
     * Create an instance of {@link BillInqInp }
     * 
     */
    public BillInqInp createBillInqInp() {
        return new BillInqInp();
    }

    /**
     * Create an instance of {@link BillInqRq }
     * 
     */
    public BillInqRq createBillInqRq() {
        return new BillInqRq();
    }

    /**
     * Create an instance of {@link BillerId }
     * 
     */
    public BillerId createBillerId() {
        return new BillerId();
    }

    /**
     * Create an instance of {@link BillInqOut }
     * 
     */
    public BillInqOut createBillInqOut() {
        return new BillInqOut();
    }

    /**
     * Create an instance of {@link BillInqRs }
     * 
     */
    public BillInqRs createBillInqRs() {
        return new BillInqRs();
    }

    /**
     * Create an instance of {@link BillCountsType }
     * 
     */
    public BillCountsType createBillCountsType() {
        return new BillCountsType();
    }

    /**
     * Create an instance of {@link BillRecType }
     * 
     */
    public BillRecType createBillRecType() {
        return new BillRecType();
    }

    /**
     * Create an instance of {@link BillerInqInp }
     * 
     */
    public BillerInqInp createBillerInqInp() {
        return new BillerInqInp();
    }

    /**
     * Create an instance of {@link BillerInqRq }
     * 
     */
    public BillerInqRq createBillerInqRq() {
        return new BillerInqRq();
    }

    /**
     * Create an instance of {@link BillerInqOut }
     * 
     */
    public BillerInqOut createBillerInqOut() {
        return new BillerInqOut();
    }

    /**
     * Create an instance of {@link BillerInqRs }
     * 
     */
    public BillerInqRs createBillerInqRs() {
        return new BillerInqRs();
    }

    /**
     * Create an instance of {@link BillerRecType }
     * 
     */
    public BillerRecType createBillerRecType() {
        return new BillerRecType();
    }

    /**
     * Create an instance of {@link CCAcctMemoInqInp }
     * 
     */
    public CCAcctMemoInqInp createCCAcctMemoInqInp() {
        return new CCAcctMemoInqInp();
    }

    /**
     * Create an instance of {@link CCAcctMemoInqRq }
     * 
     */
    public CCAcctMemoInqRq createCCAcctMemoInqRq() {
        return new CCAcctMemoInqRq();
    }

    /**
     * Create an instance of {@link CCAcctMemoInqOut }
     * 
     */
    public CCAcctMemoInqOut createCCAcctMemoInqOut() {
        return new CCAcctMemoInqOut();
    }

    /**
     * Create an instance of {@link CCAcctMemoInqRs }
     * 
     */
    public CCAcctMemoInqRs createCCAcctMemoInqRs() {
        return new CCAcctMemoInqRs();
    }

    /**
     * Create an instance of {@link CCAcctStmtInqInp }
     * 
     */
    public CCAcctStmtInqInp createCCAcctStmtInqInp() {
        return new CCAcctStmtInqInp();
    }

    /**
     * Create an instance of {@link CCAcctStmtInqRq }
     * 
     */
    public CCAcctStmtInqRq createCCAcctStmtInqRq() {
        return new CCAcctStmtInqRq();
    }

    /**
     * Create an instance of {@link CCAcctStmtInqOut }
     * 
     */
    public CCAcctStmtInqOut createCCAcctStmtInqOut() {
        return new CCAcctStmtInqOut();
    }

    /**
     * Create an instance of {@link CCAcctStmtInqRs }
     * 
     */
    public CCAcctStmtInqRs createCCAcctStmtInqRs() {
        return new CCAcctStmtInqRs();
    }

    /**
     * Create an instance of {@link CCAcctTrnInqInp }
     * 
     */
    public CCAcctTrnInqInp createCCAcctTrnInqInp() {
        return new CCAcctTrnInqInp();
    }

    /**
     * Create an instance of {@link CCAcctTrnInqRq }
     * 
     */
    public CCAcctTrnInqRq createCCAcctTrnInqRq() {
        return new CCAcctTrnInqRq();
    }

    /**
     * Create an instance of {@link CCAcctTrnInqOut }
     * 
     */
    public CCAcctTrnInqOut createCCAcctTrnInqOut() {
        return new CCAcctTrnInqOut();
    }

    /**
     * Create an instance of {@link CCAcctTrnInqRs }
     * 
     */
    public CCAcctTrnInqRs createCCAcctTrnInqRs() {
        return new CCAcctTrnInqRs();
    }

    /**
     * Create an instance of {@link CheckStatusModInp }
     * 
     */
    public CheckStatusModInp createCheckStatusModInp() {
        return new CheckStatusModInp();
    }

    /**
     * Create an instance of {@link CheckStatusModRq }
     * 
     */
    public CheckStatusModRq createCheckStatusModRq() {
        return new CheckStatusModRq();
    }

    /**
     * Create an instance of {@link SerialRangeType }
     * 
     */
    public SerialRangeType createSerialRangeType() {
        return new SerialRangeType();
    }

    /**
     * Create an instance of {@link CheckStatusModOut }
     * 
     */
    public CheckStatusModOut createCheckStatusModOut() {
        return new CheckStatusModOut();
    }

    /**
     * Create an instance of {@link CheckStatusModRs }
     * 
     */
    public CheckStatusModRs createCheckStatusModRs() {
        return new CheckStatusModRs();
    }

    /**
     * Create an instance of {@link CreditAuthAddInp }
     * 
     */
    public CreditAuthAddInp createCreditAuthAddInp() {
        return new CreditAuthAddInp();
    }

    /**
     * Create an instance of {@link CreditAuthAddRq }
     * 
     */
    public CreditAuthAddRq createCreditAuthAddRq() {
        return new CreditAuthAddRq();
    }

    /**
     * Create an instance of {@link CreditAuthInfo }
     * 
     */
    public CreditAuthInfo createCreditAuthInfo() {
        return new CreditAuthInfo();
    }

    /**
     * Create an instance of {@link CompositeCurAmt }
     * 
     */
    public CompositeCurAmt createCompositeCurAmt() {
        return new CompositeCurAmt();
    }

    /**
     * Create an instance of {@link CreditAuthAddOut }
     * 
     */
    public CreditAuthAddOut createCreditAuthAddOut() {
        return new CreditAuthAddOut();
    }

    /**
     * Create an instance of {@link CreditAuthAddRs }
     * 
     */
    public CreditAuthAddRs createCreditAuthAddRs() {
        return new CreditAuthAddRs();
    }

    /**
     * Create an instance of {@link CreditAuthRec }
     * 
     */
    public CreditAuthRec createCreditAuthRec() {
        return new CreditAuthRec();
    }

    /**
     * Create an instance of {@link CreditAuthStatus }
     * 
     */
    public CreditAuthStatus createCreditAuthStatus() {
        return new CreditAuthStatus();
    }

    /**
     * Create an instance of {@link CustAddInp }
     * 
     */
    public CustAddInp createCustAddInp() {
        return new CustAddInp();
    }

    /**
     * Create an instance of {@link CustAddRq }
     * 
     */
    public CustAddRq createCustAddRq() {
        return new CustAddRq();
    }

    /**
     * Create an instance of {@link SecretList }
     * 
     */
    public SecretList createSecretList() {
        return new SecretList();
    }

    /**
     * Create an instance of {@link CryptSecret }
     * 
     */
    public CryptSecret createCryptSecret() {
        return new CryptSecret();
    }

    /**
     * Create an instance of {@link AuthInfo }
     * 
     */
    public AuthInfo createAuthInfo() {
        return new AuthInfo();
    }

    /**
     * Create an instance of {@link ExternalPswd }
     * 
     */
    public ExternalPswd createExternalPswd() {
        return new ExternalPswd();
    }

    /**
     * Create an instance of {@link ATMPswd }
     * 
     */
    public ATMPswd createATMPswd() {
        return new ATMPswd();
    }

    /**
     * Create an instance of {@link CustAddOut }
     * 
     */
    public CustAddOut createCustAddOut() {
        return new CustAddOut();
    }

    /**
     * Create an instance of {@link CustAddRs }
     * 
     */
    public CustAddRs createCustAddRs() {
        return new CustAddRs();
    }

    /**
     * Create an instance of {@link CustEnrolInp }
     * 
     */
    public CustEnrolInp createCustEnrolInp() {
        return new CustEnrolInp();
    }

    /**
     * Create an instance of {@link CustEnrolOut }
     * 
     */
    public CustEnrolOut createCustEnrolOut() {
        return new CustEnrolOut();
    }

    /**
     * Create an instance of {@link CustInqInp }
     * 
     */
    public CustInqInp createCustInqInp() {
        return new CustInqInp();
    }

    /**
     * Create an instance of {@link CustInqRq }
     * 
     */
    public CustInqRq createCustInqRq() {
        return new CustInqRq();
    }

    /**
     * Create an instance of {@link CustInqOut }
     * 
     */
    public CustInqOut createCustInqOut() {
        return new CustInqOut();
    }

    /**
     * Create an instance of {@link CustInqRs.CustInqRec }
     * 
     */
    public CustInqRs.CustInqRec createCustInqRsCustInqRec() {
        return new CustInqRs.CustInqRec();
    }

    /**
     * Create an instance of {@link CustModInp }
     * 
     */
    public CustModInp createCustModInp() {
        return new CustModInp();
    }

    /**
     * Create an instance of {@link CustModRq }
     * 
     */
    public CustModRq createCustModRq() {
        return new CustModRq();
    }

    /**
     * Create an instance of {@link CustInfo }
     * 
     */
    public CustInfo createCustInfo() {
        return new CustInfo();
    }

    /**
     * Create an instance of {@link CustName }
     * 
     */
    public CustName createCustName() {
        return new CustName();
    }

    /**
     * Create an instance of {@link CustContact }
     * 
     */
    public CustContact createCustContact() {
        return new CustContact();
    }

    /**
     * Create an instance of {@link IdentificationInfoType }
     * 
     */
    public IdentificationInfoType createIdentificationInfoType() {
        return new IdentificationInfoType();
    }

    /**
     * Create an instance of {@link EmploymentHistoryType }
     * 
     */
    public EmploymentHistoryType createEmploymentHistoryType() {
        return new EmploymentHistoryType();
    }

    /**
     * Create an instance of {@link OrgInfo }
     * 
     */
    public OrgInfo createOrgInfo() {
        return new OrgInfo();
    }

    /**
     * Create an instance of {@link CompositeContactInfo }
     * 
     */
    public CompositeContactInfo createCompositeContactInfo() {
        return new CompositeContactInfo();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link PhoneNum }
     * 
     */
    public PhoneNum createPhoneNum() {
        return new PhoneNum();
    }

    /**
     * Create an instance of {@link CustModOut }
     * 
     */
    public CustModOut createCustModOut() {
        return new CustModOut();
    }

    /**
     * Create an instance of {@link CustModRs }
     * 
     */
    public CustModRs createCustModRs() {
        return new CustModRs();
    }

    /**
     * Create an instance of {@link CustRec }
     * 
     */
    public CustRec createCustRec() {
        return new CustRec();
    }

    /**
     * Create an instance of {@link CustPayeeAddInp }
     * 
     */
    public CustPayeeAddInp createCustPayeeAddInp() {
        return new CustPayeeAddInp();
    }

    /**
     * Create an instance of {@link CustPayeeAddRq }
     * 
     */
    public CustPayeeAddRq createCustPayeeAddRq() {
        return new CustPayeeAddRq();
    }

    /**
     * Create an instance of {@link CustPayeeInfo }
     * 
     */
    public CustPayeeInfo createCustPayeeInfo() {
        return new CustPayeeInfo();
    }

    /**
     * Create an instance of {@link Merchant }
     * 
     */
    public Merchant createMerchant() {
        return new Merchant();
    }

    /**
     * Create an instance of {@link StdPayeeId }
     * 
     */
    public StdPayeeId createStdPayeeId() {
        return new StdPayeeId();
    }

    /**
     * Create an instance of {@link FSPayee }
     * 
     */
    public FSPayee createFSPayee() {
        return new FSPayee();
    }

    /**
     * Create an instance of {@link OrgContact }
     * 
     */
    public OrgContact createOrgContact() {
        return new OrgContact();
    }

    /**
     * Create an instance of {@link OrgId }
     * 
     */
    public OrgId createOrgId() {
        return new OrgId();
    }

    /**
     * Create an instance of {@link XferPayee }
     * 
     */
    public XferPayee createXferPayee() {
        return new XferPayee();
    }

    /**
     * Create an instance of {@link DepAcctIdTo }
     * 
     */
    public DepAcctIdTo createDepAcctIdTo() {
        return new DepAcctIdTo();
    }

    /**
     * Create an instance of {@link BillerPayee }
     * 
     */
    public BillerPayee createBillerPayee() {
        return new BillerPayee();
    }

    /**
     * Create an instance of {@link BillerContact }
     * 
     */
    public BillerContact createBillerContact() {
        return new BillerContact();
    }

    /**
     * Create an instance of {@link BillRetAddr }
     * 
     */
    public BillRetAddr createBillRetAddr() {
        return new BillRetAddr();
    }

    /**
     * Create an instance of {@link RemitAddr }
     * 
     */
    public RemitAddr createRemitAddr() {
        return new RemitAddr();
    }

    /**
     * Create an instance of {@link BillerPayInfo }
     * 
     */
    public BillerPayInfo createBillerPayInfo() {
        return new BillerPayInfo();
    }

    /**
     * Create an instance of {@link PmtInst }
     * 
     */
    public PmtInst createPmtInst() {
        return new PmtInst();
    }

    /**
     * Create an instance of {@link SettlementInfo }
     * 
     */
    public SettlementInfo createSettlementInfo() {
        return new SettlementInfo();
    }

    /**
     * Create an instance of {@link PmtInstruction }
     * 
     */
    public PmtInstruction createPmtInstruction() {
        return new PmtInstruction();
    }

    /**
     * Create an instance of {@link IntermediaryDepAcct }
     * 
     */
    public IntermediaryDepAcct createIntermediaryDepAcct() {
        return new IntermediaryDepAcct();
    }

    /**
     * Create an instance of {@link FeeChargeAlloc }
     * 
     */
    public FeeChargeAlloc createFeeChargeAlloc() {
        return new FeeChargeAlloc();
    }

    /**
     * Create an instance of {@link Fee }
     * 
     */
    public Fee createFee() {
        return new Fee();
    }

    /**
     * Create an instance of {@link DfltPmtInfo }
     * 
     */
    public DfltPmtInfo createDfltPmtInfo() {
        return new DfltPmtInfo();
    }

    /**
     * Create an instance of {@link DepAcctIdFrom }
     * 
     */
    public DepAcctIdFrom createDepAcctIdFrom() {
        return new DepAcctIdFrom();
    }

    /**
     * Create an instance of {@link CardAcctIdFrom }
     * 
     */
    public CardAcctIdFrom createCardAcctIdFrom() {
        return new CardAcctIdFrom();
    }

    /**
     * Create an instance of {@link CustPayeeAddOut }
     * 
     */
    public CustPayeeAddOut createCustPayeeAddOut() {
        return new CustPayeeAddOut();
    }

    /**
     * Create an instance of {@link CustPayeeAddRs }
     * 
     */
    public CustPayeeAddRs createCustPayeeAddRs() {
        return new CustPayeeAddRs();
    }

    /**
     * Create an instance of {@link CustPayeeRec }
     * 
     */
    public CustPayeeRec createCustPayeeRec() {
        return new CustPayeeRec();
    }

    /**
     * Create an instance of {@link CustPayeeDelInp }
     * 
     */
    public CustPayeeDelInp createCustPayeeDelInp() {
        return new CustPayeeDelInp();
    }

    /**
     * Create an instance of {@link CustPayeeDelRq }
     * 
     */
    public CustPayeeDelRq createCustPayeeDelRq() {
        return new CustPayeeDelRq();
    }

    /**
     * Create an instance of {@link CustPayeeDelOut }
     * 
     */
    public CustPayeeDelOut createCustPayeeDelOut() {
        return new CustPayeeDelOut();
    }

    /**
     * Create an instance of {@link CustPayeeDelRs }
     * 
     */
    public CustPayeeDelRs createCustPayeeDelRs() {
        return new CustPayeeDelRs();
    }

    /**
     * Create an instance of {@link CustPayeeModInp }
     * 
     */
    public CustPayeeModInp createCustPayeeModInp() {
        return new CustPayeeModInp();
    }

    /**
     * Create an instance of {@link CustPayeeModRq }
     * 
     */
    public CustPayeeModRq createCustPayeeModRq() {
        return new CustPayeeModRq();
    }

    /**
     * Create an instance of {@link CustPayeeModOut }
     * 
     */
    public CustPayeeModOut createCustPayeeModOut() {
        return new CustPayeeModOut();
    }

    /**
     * Create an instance of {@link CustPayeeModRs }
     * 
     */
    public CustPayeeModRs createCustPayeeModRs() {
        return new CustPayeeModRs();
    }

    /**
     * Create an instance of {@link CustPayeeSrchInp }
     * 
     */
    public CustPayeeSrchInp createCustPayeeSrchInp() {
        return new CustPayeeSrchInp();
    }

    /**
     * Create an instance of {@link CustPayeeSrchRq }
     * 
     */
    public CustPayeeSrchRq createCustPayeeSrchRq() {
        return new CustPayeeSrchRq();
    }

    /**
     * Create an instance of {@link RecCtrlIn }
     * 
     */
    public RecCtrlIn createRecCtrlIn() {
        return new RecCtrlIn();
    }

    /**
     * Create an instance of {@link Cursor }
     * 
     */
    public Cursor createCursor() {
        return new Cursor();
    }

    /**
     * Create an instance of {@link CustPayeeSrchOut }
     * 
     */
    public CustPayeeSrchOut createCustPayeeSrchOut() {
        return new CustPayeeSrchOut();
    }

    /**
     * Create an instance of {@link CustPayeeSrchRs }
     * 
     */
    public CustPayeeSrchRs createCustPayeeSrchRs() {
        return new CustPayeeSrchRs();
    }

    /**
     * Create an instance of {@link RecCtrlOut }
     * 
     */
    public RecCtrlOut createRecCtrlOut() {
        return new RecCtrlOut();
    }

    /**
     * Create an instance of {@link CustPayeeSyncInp }
     * 
     */
    public CustPayeeSyncInp createCustPayeeSyncInp() {
        return new CustPayeeSyncInp();
    }

    /**
     * Create an instance of {@link CustPayeeSyncRq }
     * 
     */
    public CustPayeeSyncRq createCustPayeeSyncRq() {
        return new CustPayeeSyncRq();
    }

    /**
     * Create an instance of {@link CustPayeeSyncOut }
     * 
     */
    public CustPayeeSyncOut createCustPayeeSyncOut() {
        return new CustPayeeSyncOut();
    }

    /**
     * Create an instance of {@link CustPayeeSyncRs }
     * 
     */
    public CustPayeeSyncRs createCustPayeeSyncRs() {
        return new CustPayeeSyncRs();
    }

    /**
     * Create an instance of {@link CustPayeeMsgRec }
     * 
     */
    public CustPayeeMsgRec createCustPayeeMsgRec() {
        return new CustPayeeMsgRec();
    }

    /**
     * Create an instance of {@link CustPayeeTypeModRs }
     * 
     */
    public CustPayeeTypeModRs createCustPayeeTypeModRs() {
        return new CustPayeeTypeModRs();
    }

    /**
     * Create an instance of {@link CustSrchInp }
     * 
     */
    public CustSrchInp createCustSrchInp() {
        return new CustSrchInp();
    }

    /**
     * Create an instance of {@link CustSrchRq }
     * 
     */
    public CustSrchRq createCustSrchRq() {
        return new CustSrchRq();
    }

    /**
     * Create an instance of {@link SearchCriteriaType }
     * 
     */
    public SearchCriteriaType createSearchCriteriaType() {
        return new SearchCriteriaType();
    }

    /**
     * Create an instance of {@link CustSrchOut }
     * 
     */
    public CustSrchOut createCustSrchOut() {
        return new CustSrchOut();
    }

    /**
     * Create an instance of {@link CustSrchRs }
     * 
     */
    public CustSrchRs createCustSrchRs() {
        return new CustSrchRs();
    }

    /**
     * Create an instance of {@link CustSrchRec }
     * 
     */
    public CustSrchRec createCustSrchRec() {
        return new CustSrchRec();
    }

    /**
     * Create an instance of {@link CustUnenrolInp }
     * 
     */
    public CustUnenrolInp createCustUnenrolInp() {
        return new CustUnenrolInp();
    }

    /**
     * Create an instance of {@link CustUnenrolOut }
     * 
     */
    public CustUnenrolOut createCustUnenrolOut() {
        return new CustUnenrolOut();
    }

    /**
     * Create an instance of {@link DebitAuthAddInp }
     * 
     */
    public DebitAuthAddInp createDebitAuthAddInp() {
        return new DebitAuthAddInp();
    }

    /**
     * Create an instance of {@link DebitAuthAddRq }
     * 
     */
    public DebitAuthAddRq createDebitAuthAddRq() {
        return new DebitAuthAddRq();
    }

    /**
     * Create an instance of {@link DebitAuthInfo }
     * 
     */
    public DebitAuthInfo createDebitAuthInfo() {
        return new DebitAuthInfo();
    }

    /**
     * Create an instance of {@link DebitAuthAddOut }
     * 
     */
    public DebitAuthAddOut createDebitAuthAddOut() {
        return new DebitAuthAddOut();
    }

    /**
     * Create an instance of {@link DebitAuthAddRs }
     * 
     */
    public DebitAuthAddRs createDebitAuthAddRs() {
        return new DebitAuthAddRs();
    }

    /**
     * Create an instance of {@link DebitAuthRec }
     * 
     */
    public DebitAuthRec createDebitAuthRec() {
        return new DebitAuthRec();
    }

    /**
     * Create an instance of {@link DebitAuthStatus }
     * 
     */
    public DebitAuthStatus createDebitAuthStatus() {
        return new DebitAuthStatus();
    }

    /**
     * Create an instance of {@link DepAcctMemoInqInp }
     * 
     */
    public DepAcctMemoInqInp createDepAcctMemoInqInp() {
        return new DepAcctMemoInqInp();
    }

    /**
     * Create an instance of {@link DepAcctMemoInqRq }
     * 
     */
    public DepAcctMemoInqRq createDepAcctMemoInqRq() {
        return new DepAcctMemoInqRq();
    }

    /**
     * Create an instance of {@link DepAcctMemoInqOut }
     * 
     */
    public DepAcctMemoInqOut createDepAcctMemoInqOut() {
        return new DepAcctMemoInqOut();
    }

    /**
     * Create an instance of {@link DepAcctMemoInqRs }
     * 
     */
    public DepAcctMemoInqRs createDepAcctMemoInqRs() {
        return new DepAcctMemoInqRs();
    }

    /**
     * Create an instance of {@link DepAcctStmtInqInp }
     * 
     */
    public DepAcctStmtInqInp createDepAcctStmtInqInp() {
        return new DepAcctStmtInqInp();
    }

    /**
     * Create an instance of {@link DepAcctStmtInqRq }
     * 
     */
    public DepAcctStmtInqRq createDepAcctStmtInqRq() {
        return new DepAcctStmtInqRq();
    }

    /**
     * Create an instance of {@link DepAcctStmtInqOut }
     * 
     */
    public DepAcctStmtInqOut createDepAcctStmtInqOut() {
        return new DepAcctStmtInqOut();
    }

    /**
     * Create an instance of {@link DepAcctStmtInqRs }
     * 
     */
    public DepAcctStmtInqRs createDepAcctStmtInqRs() {
        return new DepAcctStmtInqRs();
    }

    /**
     * Create an instance of {@link DepAcctTrnInqInp }
     * 
     */
    public DepAcctTrnInqInp createDepAcctTrnInqInp() {
        return new DepAcctTrnInqInp();
    }

    /**
     * Create an instance of {@link DepAcctTrnInqRq }
     * 
     */
    public DepAcctTrnInqRq createDepAcctTrnInqRq() {
        return new DepAcctTrnInqRq();
    }

    /**
     * Create an instance of {@link DepAcctTrnInqOut }
     * 
     */
    public DepAcctTrnInqOut createDepAcctTrnInqOut() {
        return new DepAcctTrnInqOut();
    }

    /**
     * Create an instance of {@link DepAcctTrnInqRs }
     * 
     */
    public DepAcctTrnInqRs createDepAcctTrnInqRs() {
        return new DepAcctTrnInqRs();
    }

    /**
     * Create an instance of {@link DepAcctTrnStatInqInp }
     * 
     */
    public DepAcctTrnStatInqInp createDepAcctTrnStatInqInp() {
        return new DepAcctTrnStatInqInp();
    }

    /**
     * Create an instance of {@link DepAcctTrnStatInqRq }
     * 
     */
    public DepAcctTrnStatInqRq createDepAcctTrnStatInqRq() {
        return new DepAcctTrnStatInqRq();
    }

    /**
     * Create an instance of {@link DepAcctTrnStatInqOut }
     * 
     */
    public DepAcctTrnStatInqOut createDepAcctTrnStatInqOut() {
        return new DepAcctTrnStatInqOut();
    }

    /**
     * Create an instance of {@link DepAcctTrnStatInqRs }
     * 
     */
    public DepAcctTrnStatInqRs createDepAcctTrnStatInqRs() {
        return new DepAcctTrnStatInqRs();
    }

    /**
     * Create an instance of {@link DepAcctTrnStatRec }
     * 
     */
    public DepAcctTrnStatRec createDepAcctTrnStatRec() {
        return new DepAcctTrnStatRec();
    }

    /**
     * Create an instance of {@link DepAppAddInp }
     * 
     */
    public DepAppAddInp createDepAppAddInp() {
        return new DepAppAddInp();
    }

    /**
     * Create an instance of {@link DepAppAddRqType }
     * 
     */
    public DepAppAddRqType createDepAppAddRqType() {
        return new DepAppAddRqType();
    }

    /**
     * Create an instance of {@link DepAppAddOut }
     * 
     */
    public DepAppAddOut createDepAppAddOut() {
        return new DepAppAddOut();
    }

    /**
     * Create an instance of {@link DepAppAddRsType }
     * 
     */
    public DepAppAddRsType createDepAppAddRsType() {
        return new DepAppAddRsType();
    }

    /**
     * Create an instance of {@link DepDetailImgInqInp }
     * 
     */
    public DepDetailImgInqInp createDepDetailImgInqInp() {
        return new DepDetailImgInqInp();
    }

    /**
     * Create an instance of {@link DepDetailImgInqRq }
     * 
     */
    public DepDetailImgInqRq createDepDetailImgInqRq() {
        return new DepDetailImgInqRq();
    }

    /**
     * Create an instance of {@link DepDetailImgInfo }
     * 
     */
    public DepDetailImgInfo createDepDetailImgInfo() {
        return new DepDetailImgInfo();
    }

    /**
     * Create an instance of {@link DepDetailImgInqOut }
     * 
     */
    public DepDetailImgInqOut createDepDetailImgInqOut() {
        return new DepDetailImgInqOut();
    }

    /**
     * Create an instance of {@link DepDetailImgInqRs }
     * 
     */
    public DepDetailImgInqRs createDepDetailImgInqRs() {
        return new DepDetailImgInqRs();
    }

    /**
     * Create an instance of {@link DepDetailImgIDRec }
     * 
     */
    public DepDetailImgIDRec createDepDetailImgIDRec() {
        return new DepDetailImgIDRec();
    }

    /**
     * Create an instance of {@link FileStatusInp }
     * 
     */
    public FileStatusInp createFileStatusInp() {
        return new FileStatusInp();
    }

    /**
     * Create an instance of {@link FileStatusRq }
     * 
     */
    public FileStatusRq createFileStatusRq() {
        return new FileStatusRq();
    }

    /**
     * Create an instance of {@link FileStatusInfoType }
     * 
     */
    public FileStatusInfoType createFileStatusInfoType() {
        return new FileStatusInfoType();
    }

    /**
     * Create an instance of {@link FileStatusOut }
     * 
     */
    public FileStatusOut createFileStatusOut() {
        return new FileStatusOut();
    }

    /**
     * Create an instance of {@link FileStatusRs }
     * 
     */
    public FileStatusRs createFileStatusRs() {
        return new FileStatusRs();
    }

    /**
     * Create an instance of {@link FileStatusRecType }
     * 
     */
    public FileStatusRecType createFileStatusRecType() {
        return new FileStatusRecType();
    }

    /**
     * Create an instance of {@link ForExDealAddInp }
     * 
     */
    public ForExDealAddInp createForExDealAddInp() {
        return new ForExDealAddInp();
    }

    /**
     * Create an instance of {@link ForExDealAddRq }
     * 
     */
    public ForExDealAddRq createForExDealAddRq() {
        return new ForExDealAddRq();
    }

    /**
     * Create an instance of {@link MsgRqHdrType }
     * 
     */
    public MsgRqHdrType createMsgRqHdrType() {
        return new MsgRqHdrType();
    }

    /**
     * Create an instance of {@link ForExDealInfoType }
     * 
     */
    public ForExDealInfoType createForExDealInfoType() {
        return new ForExDealInfoType();
    }

    /**
     * Create an instance of {@link ForExDealAddOut }
     * 
     */
    public ForExDealAddOut createForExDealAddOut() {
        return new ForExDealAddOut();
    }

    /**
     * Create an instance of {@link ForExDealAddRs }
     * 
     */
    public ForExDealAddRs createForExDealAddRs() {
        return new ForExDealAddRs();
    }

    /**
     * Create an instance of {@link MsgRsHdrType }
     * 
     */
    public MsgRsHdrType createMsgRsHdrType() {
        return new MsgRsHdrType();
    }

    /**
     * Create an instance of {@link ForExDealRecType }
     * 
     */
    public ForExDealRecType createForExDealRecType() {
        return new ForExDealRecType();
    }

    /**
     * Create an instance of {@link ForExDealAuthCanInp }
     * 
     */
    public ForExDealAuthCanInp createForExDealAuthCanInp() {
        return new ForExDealAuthCanInp();
    }

    /**
     * Create an instance of {@link ForExDealAuthCanRq }
     * 
     */
    public ForExDealAuthCanRq createForExDealAuthCanRq() {
        return new ForExDealAuthCanRq();
    }

    /**
     * Create an instance of {@link ForExDealAuthCanOut }
     * 
     */
    public ForExDealAuthCanOut createForExDealAuthCanOut() {
        return new ForExDealAuthCanOut();
    }

    /**
     * Create an instance of {@link ForExDealAuthCanRs }
     * 
     */
    public ForExDealAuthCanRs createForExDealAuthCanRs() {
        return new ForExDealAuthCanRs();
    }

    /**
     * Create an instance of {@link ForExOffsetRateInfoType }
     * 
     */
    public ForExOffsetRateInfoType createForExOffsetRateInfoType() {
        return new ForExOffsetRateInfoType();
    }

    /**
     * Create an instance of {@link ForExDealCanInp }
     * 
     */
    public ForExDealCanInp createForExDealCanInp() {
        return new ForExDealCanInp();
    }

    /**
     * Create an instance of {@link ForExDealCanRq }
     * 
     */
    public ForExDealCanRq createForExDealCanRq() {
        return new ForExDealCanRq();
    }

    /**
     * Create an instance of {@link ForExDealCanOut }
     * 
     */
    public ForExDealCanOut createForExDealCanOut() {
        return new ForExDealCanOut();
    }

    /**
     * Create an instance of {@link ForExDealCanRs }
     * 
     */
    public ForExDealCanRs createForExDealCanRs() {
        return new ForExDealCanRs();
    }

    /**
     * Create an instance of {@link ForExDealInqInp }
     * 
     */
    public ForExDealInqInp createForExDealInqInp() {
        return new ForExDealInqInp();
    }

    /**
     * Create an instance of {@link ForExDealInqRq }
     * 
     */
    public ForExDealInqRq createForExDealInqRq() {
        return new ForExDealInqRq();
    }

    /**
     * Create an instance of {@link ForExDealInqOut }
     * 
     */
    public ForExDealInqOut createForExDealInqOut() {
        return new ForExDealInqOut();
    }

    /**
     * Create an instance of {@link ForExDealInqRs }
     * 
     */
    public ForExDealInqRs createForExDealInqRs() {
        return new ForExDealInqRs();
    }

    /**
     * Create an instance of {@link ForExDealModInp }
     * 
     */
    public ForExDealModInp createForExDealModInp() {
        return new ForExDealModInp();
    }

    /**
     * Create an instance of {@link ForExDealModRq }
     * 
     */
    public ForExDealModRq createForExDealModRq() {
        return new ForExDealModRq();
    }

    /**
     * Create an instance of {@link ForExDealModOut }
     * 
     */
    public ForExDealModOut createForExDealModOut() {
        return new ForExDealModOut();
    }

    /**
     * Create an instance of {@link ForExDealModRs }
     * 
     */
    public ForExDealModRs createForExDealModRs() {
        return new ForExDealModRs();
    }

    /**
     * Create an instance of {@link ForExDealSyncInp }
     * 
     */
    public ForExDealSyncInp createForExDealSyncInp() {
        return new ForExDealSyncInp();
    }

    /**
     * Create an instance of {@link ForExDealSyncRq }
     * 
     */
    public ForExDealSyncRq createForExDealSyncRq() {
        return new ForExDealSyncRq();
    }

    /**
     * Create an instance of {@link ForExDealSyncOut }
     * 
     */
    public ForExDealSyncOut createForExDealSyncOut() {
        return new ForExDealSyncOut();
    }

    /**
     * Create an instance of {@link ForExDealSyncRs }
     * 
     */
    public ForExDealSyncRs createForExDealSyncRs() {
        return new ForExDealSyncRs();
    }

    /**
     * Create an instance of {@link ForExDealMsgRecType }
     * 
     */
    public ForExDealMsgRecType createForExDealMsgRecType() {
        return new ForExDealMsgRecType();
    }

    /**
     * Create an instance of {@link ForExRateCanInp }
     * 
     */
    public ForExRateCanInp createForExRateCanInp() {
        return new ForExRateCanInp();
    }

    /**
     * Create an instance of {@link ForExRateCanRq }
     * 
     */
    public ForExRateCanRq createForExRateCanRq() {
        return new ForExRateCanRq();
    }

    /**
     * Create an instance of {@link ForExRateCanOut }
     * 
     */
    public ForExRateCanOut createForExRateCanOut() {
        return new ForExRateCanOut();
    }

    /**
     * Create an instance of {@link ForExRateCanRs }
     * 
     */
    public ForExRateCanRs createForExRateCanRs() {
        return new ForExRateCanRs();
    }

    /**
     * Create an instance of {@link ForExRateRec }
     * 
     */
    public ForExRateRec createForExRateRec() {
        return new ForExRateRec();
    }

    /**
     * Create an instance of {@link ForExRateInfo }
     * 
     */
    public ForExRateInfo createForExRateInfo() {
        return new ForExRateInfo();
    }

    /**
     * Create an instance of {@link ForExRateInqInp }
     * 
     */
    public ForExRateInqInp createForExRateInqInp() {
        return new ForExRateInqInp();
    }

    /**
     * Create an instance of {@link ForExRateInqRq }
     * 
     */
    public ForExRateInqRq createForExRateInqRq() {
        return new ForExRateInqRq();
    }

    /**
     * Create an instance of {@link ForExRateInqOut }
     * 
     */
    public ForExRateInqOut createForExRateInqOut() {
        return new ForExRateInqOut();
    }

    /**
     * Create an instance of {@link ForExRateInqRs }
     * 
     */
    public ForExRateInqRs createForExRateInqRs() {
        return new ForExRateInqRs();
    }

    /**
     * Create an instance of {@link ForExRateSheetInqInp }
     * 
     */
    public ForExRateSheetInqInp createForExRateSheetInqInp() {
        return new ForExRateSheetInqInp();
    }

    /**
     * Create an instance of {@link ForExRateSheetInqRq }
     * 
     */
    public ForExRateSheetInqRq createForExRateSheetInqRq() {
        return new ForExRateSheetInqRq();
    }

    /**
     * Create an instance of {@link ForExRateSheetInqOut }
     * 
     */
    public ForExRateSheetInqOut createForExRateSheetInqOut() {
        return new ForExRateSheetInqOut();
    }

    /**
     * Create an instance of {@link ForExRateSheetInqRs }
     * 
     */
    public ForExRateSheetInqRs createForExRateSheetInqRs() {
        return new ForExRateSheetInqRs();
    }

    /**
     * Create an instance of {@link CurCodeRatesType }
     * 
     */
    public CurCodeRatesType createCurCodeRatesType() {
        return new CurCodeRatesType();
    }

    /**
     * Create an instance of {@link GenAppAddInp }
     * 
     */
    public GenAppAddInp createGenAppAddInp() {
        return new GenAppAddInp();
    }

    /**
     * Create an instance of {@link GenAppAddRqType }
     * 
     */
    public GenAppAddRqType createGenAppAddRqType() {
        return new GenAppAddRqType();
    }

    /**
     * Create an instance of {@link GenAppAddOut }
     * 
     */
    public GenAppAddOut createGenAppAddOut() {
        return new GenAppAddOut();
    }

    /**
     * Create an instance of {@link GenAppAddRsType }
     * 
     */
    public GenAppAddRsType createGenAppAddRsType() {
        return new GenAppAddRsType();
    }

    /**
     * Create an instance of {@link GenAppCanInp }
     * 
     */
    public GenAppCanInp createGenAppCanInp() {
        return new GenAppCanInp();
    }

    /**
     * Create an instance of {@link GenAppCanRqType }
     * 
     */
    public GenAppCanRqType createGenAppCanRqType() {
        return new GenAppCanRqType();
    }

    /**
     * Create an instance of {@link GenAppCanOut }
     * 
     */
    public GenAppCanOut createGenAppCanOut() {
        return new GenAppCanOut();
    }

    /**
     * Create an instance of {@link GenAppCanRsType }
     * 
     */
    public GenAppCanRsType createGenAppCanRsType() {
        return new GenAppCanRsType();
    }

    /**
     * Create an instance of {@link HostCustAddInp }
     * 
     */
    public HostCustAddInp createHostCustAddInp() {
        return new HostCustAddInp();
    }

    /**
     * Create an instance of {@link HostCustAddRqType }
     * 
     */
    public HostCustAddRqType createHostCustAddRqType() {
        return new HostCustAddRqType();
    }

    /**
     * Create an instance of {@link HostCustAddOut }
     * 
     */
    public HostCustAddOut createHostCustAddOut() {
        return new HostCustAddOut();
    }

    /**
     * Create an instance of {@link HostCustAddRsType }
     * 
     */
    public HostCustAddRsType createHostCustAddRsType() {
        return new HostCustAddRsType();
    }

    /**
     * Create an instance of {@link InterfaceVersionInp }
     * 
     */
    public InterfaceVersionInp createInterfaceVersionInp() {
        return new InterfaceVersionInp();
    }

    /**
     * Create an instance of {@link InterfaceVersionOut }
     * 
     */
    public InterfaceVersionOut createInterfaceVersionOut() {
        return new InterfaceVersionOut();
    }

    /**
     * Create an instance of {@link LoanAcctMemoInqInp }
     * 
     */
    public LoanAcctMemoInqInp createLoanAcctMemoInqInp() {
        return new LoanAcctMemoInqInp();
    }

    /**
     * Create an instance of {@link LoanAcctMemoInqRq }
     * 
     */
    public LoanAcctMemoInqRq createLoanAcctMemoInqRq() {
        return new LoanAcctMemoInqRq();
    }

    /**
     * Create an instance of {@link LoanAcctMemoInqOut }
     * 
     */
    public LoanAcctMemoInqOut createLoanAcctMemoInqOut() {
        return new LoanAcctMemoInqOut();
    }

    /**
     * Create an instance of {@link LoanAcctMemoInqRs }
     * 
     */
    public LoanAcctMemoInqRs createLoanAcctMemoInqRs() {
        return new LoanAcctMemoInqRs();
    }

    /**
     * Create an instance of {@link LoanNoteListInqInp }
     * 
     */
    public LoanNoteListInqInp createLoanNoteListInqInp() {
        return new LoanNoteListInqInp();
    }

    /**
     * Create an instance of {@link LoanNoteListInqRq }
     * 
     */
    public LoanNoteListInqRq createLoanNoteListInqRq() {
        return new LoanNoteListInqRq();
    }

    /**
     * Create an instance of {@link NoteRangeType }
     * 
     */
    public NoteRangeType createNoteRangeType() {
        return new NoteRangeType();
    }

    /**
     * Create an instance of {@link LoanNoteListInqOut }
     * 
     */
    public LoanNoteListInqOut createLoanNoteListInqOut() {
        return new LoanNoteListInqOut();
    }

    /**
     * Create an instance of {@link LoanNoteListInqRs }
     * 
     */
    public LoanNoteListInqRs createLoanNoteListInqRs() {
        return new LoanNoteListInqRs();
    }

    /**
     * Create an instance of {@link LoanNoteRec.CommitmentAmount }
     * 
     */
    public LoanNoteRec.CommitmentAmount createLoanNoteRecCommitmentAmount() {
        return new LoanNoteRec.CommitmentAmount();
    }

    /**
     * Create an instance of {@link TotalDueCurAmt }
     * 
     */
    public TotalDueCurAmt createTotalDueCurAmt() {
        return new TotalDueCurAmt();
    }

    /**
     * Create an instance of {@link LoanNoteBillRec.BillAmount }
     * 
     */
    public LoanNoteBillRec.BillAmount createLoanNoteBillRecBillAmount() {
        return new LoanNoteBillRec.BillAmount();
    }

    /**
     * Create an instance of {@link LoanNoteBillRec.TotalBillNotPaid }
     * 
     */
    public LoanNoteBillRec.TotalBillNotPaid createLoanNoteBillRecTotalBillNotPaid() {
        return new LoanNoteBillRec.TotalBillNotPaid();
    }

    /**
     * Create an instance of {@link LoanNoteInqInp }
     * 
     */
    public LoanNoteInqInp createLoanNoteInqInp() {
        return new LoanNoteInqInp();
    }

    /**
     * Create an instance of {@link LoanNoteInqRq }
     * 
     */
    public LoanNoteInqRq createLoanNoteInqRq() {
        return new LoanNoteInqRq();
    }

    /**
     * Create an instance of {@link LoanNoteInqOut }
     * 
     */
    public LoanNoteInqOut createLoanNoteInqOut() {
        return new LoanNoteInqOut();
    }

    /**
     * Create an instance of {@link LoanNoteInqRs }
     * 
     */
    public LoanNoteInqRs createLoanNoteInqRs() {
        return new LoanNoteInqRs();
    }

    /**
     * Create an instance of {@link LoanNoteMemoInqInp }
     * 
     */
    public LoanNoteMemoInqInp createLoanNoteMemoInqInp() {
        return new LoanNoteMemoInqInp();
    }

    /**
     * Create an instance of {@link LoanNoteMemoInqRq }
     * 
     */
    public LoanNoteMemoInqRq createLoanNoteMemoInqRq() {
        return new LoanNoteMemoInqRq();
    }

    /**
     * Create an instance of {@link DtRangeType }
     * 
     */
    public DtRangeType createDtRangeType() {
        return new DtRangeType();
    }

    /**
     * Create an instance of {@link LoanNoteMemoInqOut }
     * 
     */
    public LoanNoteMemoInqOut createLoanNoteMemoInqOut() {
        return new LoanNoteMemoInqOut();
    }

    /**
     * Create an instance of {@link LoanNoteMemoInqRs }
     * 
     */
    public LoanNoteMemoInqRs createLoanNoteMemoInqRs() {
        return new LoanNoteMemoInqRs();
    }

    /**
     * Create an instance of {@link LoanNoteTrnRec }
     * 
     */
    public LoanNoteTrnRec createLoanNoteTrnRec() {
        return new LoanNoteTrnRec();
    }

    /**
     * Create an instance of {@link LoanAcctStmtInqInp }
     * 
     */
    public LoanAcctStmtInqInp createLoanAcctStmtInqInp() {
        return new LoanAcctStmtInqInp();
    }

    /**
     * Create an instance of {@link LoanAcctStmtInqRq }
     * 
     */
    public LoanAcctStmtInqRq createLoanAcctStmtInqRq() {
        return new LoanAcctStmtInqRq();
    }

    /**
     * Create an instance of {@link LoanAcctStmtInqOut }
     * 
     */
    public LoanAcctStmtInqOut createLoanAcctStmtInqOut() {
        return new LoanAcctStmtInqOut();
    }

    /**
     * Create an instance of {@link LoanAcctStmtInqRs }
     * 
     */
    public LoanAcctStmtInqRs createLoanAcctStmtInqRs() {
        return new LoanAcctStmtInqRs();
    }

    /**
     * Create an instance of {@link LoanAcctTrnInqInp }
     * 
     */
    public LoanAcctTrnInqInp createLoanAcctTrnInqInp() {
        return new LoanAcctTrnInqInp();
    }

    /**
     * Create an instance of {@link LoanAcctTrnInqRq }
     * 
     */
    public LoanAcctTrnInqRq createLoanAcctTrnInqRq() {
        return new LoanAcctTrnInqRq();
    }

    /**
     * Create an instance of {@link LoanAcctTrnInqOut }
     * 
     */
    public LoanAcctTrnInqOut createLoanAcctTrnInqOut() {
        return new LoanAcctTrnInqOut();
    }

    /**
     * Create an instance of {@link LoanAcctTrnInqRs }
     * 
     */
    public LoanAcctTrnInqRs createLoanAcctTrnInqRs() {
        return new LoanAcctTrnInqRs();
    }

    /**
     * Create an instance of {@link LoanNoteTrnInqInp }
     * 
     */
    public LoanNoteTrnInqInp createLoanNoteTrnInqInp() {
        return new LoanNoteTrnInqInp();
    }

    /**
     * Create an instance of {@link LoanNoteTrnInqRq }
     * 
     */
    public LoanNoteTrnInqRq createLoanNoteTrnInqRq() {
        return new LoanNoteTrnInqRq();
    }

    /**
     * Create an instance of {@link LoanNoteTrnInqOut }
     * 
     */
    public LoanNoteTrnInqOut createLoanNoteTrnInqOut() {
        return new LoanNoteTrnInqOut();
    }

    /**
     * Create an instance of {@link LoanNoteTrnInqRs }
     * 
     */
    public LoanNoteTrnInqRs createLoanNoteTrnInqRs() {
        return new LoanNoteTrnInqRs();
    }

    /**
     * Create an instance of {@link PartyAcctRelAddInp }
     * 
     */
    public PartyAcctRelAddInp createPartyAcctRelAddInp() {
        return new PartyAcctRelAddInp();
    }

    /**
     * Create an instance of {@link PartyAcctRelAddRqType }
     * 
     */
    public PartyAcctRelAddRqType createPartyAcctRelAddRqType() {
        return new PartyAcctRelAddRqType();
    }

    /**
     * Create an instance of {@link PartyAcctRelAddOut }
     * 
     */
    public PartyAcctRelAddOut createPartyAcctRelAddOut() {
        return new PartyAcctRelAddOut();
    }

    /**
     * Create an instance of {@link PartyAcctRelAddRsType }
     * 
     */
    public PartyAcctRelAddRsType createPartyAcctRelAddRsType() {
        return new PartyAcctRelAddRsType();
    }

    /**
     * Create an instance of {@link PartyAcctRelDelInp }
     * 
     */
    public PartyAcctRelDelInp createPartyAcctRelDelInp() {
        return new PartyAcctRelDelInp();
    }

    /**
     * Create an instance of {@link PartyAcctRelDelRqType }
     * 
     */
    public PartyAcctRelDelRqType createPartyAcctRelDelRqType() {
        return new PartyAcctRelDelRqType();
    }

    /**
     * Create an instance of {@link PartyAcctRelDelOut }
     * 
     */
    public PartyAcctRelDelOut createPartyAcctRelDelOut() {
        return new PartyAcctRelDelOut();
    }

    /**
     * Create an instance of {@link PartyAcctRelDelRsType }
     * 
     */
    public PartyAcctRelDelRsType createPartyAcctRelDelRsType() {
        return new PartyAcctRelDelRsType();
    }

    /**
     * Create an instance of {@link PartyAcctRelInqInp }
     * 
     */
    public PartyAcctRelInqInp createPartyAcctRelInqInp() {
        return new PartyAcctRelInqInp();
    }

    /**
     * Create an instance of {@link PartyAcctRelInqRqType }
     * 
     */
    public PartyAcctRelInqRqType createPartyAcctRelInqRqType() {
        return new PartyAcctRelInqRqType();
    }

    /**
     * Create an instance of {@link PartyAcctRelInqOut }
     * 
     */
    public PartyAcctRelInqOut createPartyAcctRelInqOut() {
        return new PartyAcctRelInqOut();
    }

    /**
     * Create an instance of {@link PartyAcctRelInqRsType }
     * 
     */
    public PartyAcctRelInqRsType createPartyAcctRelInqRsType() {
        return new PartyAcctRelInqRsType();
    }

    /**
     * Create an instance of {@link PartyAcctRelModInp }
     * 
     */
    public PartyAcctRelModInp createPartyAcctRelModInp() {
        return new PartyAcctRelModInp();
    }

    /**
     * Create an instance of {@link PartyAcctRelModRqType }
     * 
     */
    public PartyAcctRelModRqType createPartyAcctRelModRqType() {
        return new PartyAcctRelModRqType();
    }

    /**
     * Create an instance of {@link PartyAcctRelModOut }
     * 
     */
    public PartyAcctRelModOut createPartyAcctRelModOut() {
        return new PartyAcctRelModOut();
    }

    /**
     * Create an instance of {@link PartyAcctRelModRsType }
     * 
     */
    public PartyAcctRelModRsType createPartyAcctRelModRsType() {
        return new PartyAcctRelModRsType();
    }

    /**
     * Create an instance of {@link PmtAddInp }
     * 
     */
    public PmtAddInp createPmtAddInp() {
        return new PmtAddInp();
    }

    /**
     * Create an instance of {@link PmtAddRq }
     * 
     */
    public PmtAddRq createPmtAddRq() {
        return new PmtAddRq();
    }

    /**
     * Create an instance of {@link PmtInfo }
     * 
     */
    public PmtInfo createPmtInfo() {
        return new PmtInfo();
    }

    /**
     * Create an instance of {@link PayerInfoType }
     * 
     */
    public PayerInfoType createPayerInfoType() {
        return new PayerInfoType();
    }

    /**
     * Create an instance of {@link RemitInfo }
     * 
     */
    public RemitInfo createRemitInfo() {
        return new RemitInfo();
    }

    /**
     * Create an instance of {@link RemitInstruction }
     * 
     */
    public RemitInstruction createRemitInstruction() {
        return new RemitInstruction();
    }

    /**
     * Create an instance of {@link ChkInfo }
     * 
     */
    public ChkInfo createChkInfo() {
        return new ChkInfo();
    }

    /**
     * Create an instance of {@link PmtSummAmt }
     * 
     */
    public PmtSummAmt createPmtSummAmt() {
        return new PmtSummAmt();
    }

    /**
     * Create an instance of {@link InvoiceInfo }
     * 
     */
    public InvoiceInfo createInvoiceInfo() {
        return new InvoiceInfo();
    }

    /**
     * Create an instance of {@link TotalCurAmt }
     * 
     */
    public TotalCurAmt createTotalCurAmt() {
        return new TotalCurAmt();
    }

    /**
     * Create an instance of {@link PaidCurAmt }
     * 
     */
    public PaidCurAmt createPaidCurAmt() {
        return new PaidCurAmt();
    }

    /**
     * Create an instance of {@link InvoicePremium }
     * 
     */
    public InvoicePremium createInvoicePremium() {
        return new InvoicePremium();
    }

    /**
     * Create an instance of {@link Discount }
     * 
     */
    public Discount createDiscount() {
        return new Discount();
    }

    /**
     * Create an instance of {@link TaxInfo }
     * 
     */
    public TaxInfo createTaxInfo() {
        return new TaxInfo();
    }

    /**
     * Create an instance of {@link InvoiceAdj }
     * 
     */
    public InvoiceAdj createInvoiceAdj() {
        return new InvoiceAdj();
    }

    /**
     * Create an instance of {@link InvoiceLineItem }
     * 
     */
    public InvoiceLineItem createInvoiceLineItem() {
        return new InvoiceLineItem();
    }

    /**
     * Create an instance of {@link RemitDetail }
     * 
     */
    public RemitDetail createRemitDetail() {
        return new RemitDetail();
    }

    /**
     * Create an instance of {@link InvoiceReceiver }
     * 
     */
    public InvoiceReceiver createInvoiceReceiver() {
        return new InvoiceReceiver();
    }

    /**
     * Create an instance of {@link InvoiceSender }
     * 
     */
    public InvoiceSender createInvoiceSender() {
        return new InvoiceSender();
    }

    /**
     * Create an instance of {@link PmtLegalRpt }
     * 
     */
    public PmtLegalRpt createPmtLegalRpt() {
        return new PmtLegalRpt();
    }

    /**
     * Create an instance of {@link PmtLegalRptData }
     * 
     */
    public PmtLegalRptData createPmtLegalRptData() {
        return new PmtLegalRptData();
    }

    /**
     * Create an instance of {@link RemittanceInfoType }
     * 
     */
    public RemittanceInfoType createRemittanceInfoType() {
        return new RemittanceInfoType();
    }

    /**
     * Create an instance of {@link PmtAddOut }
     * 
     */
    public PmtAddOut createPmtAddOut() {
        return new PmtAddOut();
    }

    /**
     * Create an instance of {@link PmtAddRs }
     * 
     */
    public PmtAddRs createPmtAddRs() {
        return new PmtAddRs();
    }

    /**
     * Create an instance of {@link PmtRec }
     * 
     */
    public PmtRec createPmtRec() {
        return new PmtRec();
    }

    /**
     * Create an instance of {@link PmtStatus }
     * 
     */
    public PmtStatus createPmtStatus() {
        return new PmtStatus();
    }

    /**
     * Create an instance of {@link PmtRemitInfo }
     * 
     */
    public PmtRemitInfo createPmtRemitInfo() {
        return new PmtRemitInfo();
    }

    /**
     * Create an instance of {@link PmtCanInp }
     * 
     */
    public PmtCanInp createPmtCanInp() {
        return new PmtCanInp();
    }

    /**
     * Create an instance of {@link PmtCanRq }
     * 
     */
    public PmtCanRq createPmtCanRq() {
        return new PmtCanRq();
    }

    /**
     * Create an instance of {@link PmtCanOut }
     * 
     */
    public PmtCanOut createPmtCanOut() {
        return new PmtCanOut();
    }

    /**
     * Create an instance of {@link PmtCanRs }
     * 
     */
    public PmtCanRs createPmtCanRs() {
        return new PmtCanRs();
    }

    /**
     * Create an instance of {@link PmtInqInp }
     * 
     */
    public PmtInqInp createPmtInqInp() {
        return new PmtInqInp();
    }

    /**
     * Create an instance of {@link PmtInqRqType }
     * 
     */
    public PmtInqRqType createPmtInqRqType() {
        return new PmtInqRqType();
    }

    /**
     * Create an instance of {@link PmtInqOut }
     * 
     */
    public PmtInqOut createPmtInqOut() {
        return new PmtInqOut();
    }

    /**
     * Create an instance of {@link PmtInqRsType }
     * 
     */
    public PmtInqRsType createPmtInqRsType() {
        return new PmtInqRsType();
    }

    /**
     * Create an instance of {@link PmtModInp }
     * 
     */
    public PmtModInp createPmtModInp() {
        return new PmtModInp();
    }

    /**
     * Create an instance of {@link PmtModRq }
     * 
     */
    public PmtModRq createPmtModRq() {
        return new PmtModRq();
    }

    /**
     * Create an instance of {@link PmtModOut }
     * 
     */
    public PmtModOut createPmtModOut() {
        return new PmtModOut();
    }

    /**
     * Create an instance of {@link PmtModRs }
     * 
     */
    public PmtModRs createPmtModRs() {
        return new PmtModRs();
    }

    /**
     * Create an instance of {@link PmtSyncInp }
     * 
     */
    public PmtSyncInp createPmtSyncInp() {
        return new PmtSyncInp();
    }

    /**
     * Create an instance of {@link PmtSyncRq }
     * 
     */
    public PmtSyncRq createPmtSyncRq() {
        return new PmtSyncRq();
    }

    /**
     * Create an instance of {@link PmtSyncOut }
     * 
     */
    public PmtSyncOut createPmtSyncOut() {
        return new PmtSyncOut();
    }

    /**
     * Create an instance of {@link PmtSyncRs }
     * 
     */
    public PmtSyncRs createPmtSyncRs() {
        return new PmtSyncRs();
    }

    /**
     * Create an instance of {@link PmtMsgRec }
     * 
     */
    public PmtMsgRec createPmtMsgRec() {
        return new PmtMsgRec();
    }

    /**
     * Create an instance of {@link PmtStatusModRs }
     * 
     */
    public PmtStatusModRs createPmtStatusModRs() {
        return new PmtStatusModRs();
    }

    /**
     * Create an instance of {@link NetworkTrnInfoType }
     * 
     */
    public NetworkTrnInfoType createNetworkTrnInfoType() {
        return new NetworkTrnInfoType();
    }

    /**
     * Create an instance of {@link RecPmtAddInp }
     * 
     */
    public RecPmtAddInp createRecPmtAddInp() {
        return new RecPmtAddInp();
    }

    /**
     * Create an instance of {@link RecPmtAddRq }
     * 
     */
    public RecPmtAddRq createRecPmtAddRq() {
        return new RecPmtAddRq();
    }

    /**
     * Create an instance of {@link RecModelInfo }
     * 
     */
    public RecModelInfo createRecModelInfo() {
        return new RecModelInfo();
    }

    /**
     * Create an instance of {@link InitialCurAmt }
     * 
     */
    public InitialCurAmt createInitialCurAmt() {
        return new InitialCurAmt();
    }

    /**
     * Create an instance of {@link FinalCurAmt }
     * 
     */
    public FinalCurAmt createFinalCurAmt() {
        return new FinalCurAmt();
    }

    /**
     * Create an instance of {@link RecPmtAddOut }
     * 
     */
    public RecPmtAddOut createRecPmtAddOut() {
        return new RecPmtAddOut();
    }

    /**
     * Create an instance of {@link RecPmtAddRs }
     * 
     */
    public RecPmtAddRs createRecPmtAddRs() {
        return new RecPmtAddRs();
    }

    /**
     * Create an instance of {@link RecPmtRec }
     * 
     */
    public RecPmtRec createRecPmtRec() {
        return new RecPmtRec();
    }

    /**
     * Create an instance of {@link RecPmtCanInp }
     * 
     */
    public RecPmtCanInp createRecPmtCanInp() {
        return new RecPmtCanInp();
    }

    /**
     * Create an instance of {@link RecPmtCanRq }
     * 
     */
    public RecPmtCanRq createRecPmtCanRq() {
        return new RecPmtCanRq();
    }

    /**
     * Create an instance of {@link RecPmtCanOut }
     * 
     */
    public RecPmtCanOut createRecPmtCanOut() {
        return new RecPmtCanOut();
    }

    /**
     * Create an instance of {@link RecPmtCanRs }
     * 
     */
    public RecPmtCanRs createRecPmtCanRs() {
        return new RecPmtCanRs();
    }

    /**
     * Create an instance of {@link RecPmtInqInp }
     * 
     */
    public RecPmtInqInp createRecPmtInqInp() {
        return new RecPmtInqInp();
    }

    /**
     * Create an instance of {@link RecPmtInqRqType }
     * 
     */
    public RecPmtInqRqType createRecPmtInqRqType() {
        return new RecPmtInqRqType();
    }

    /**
     * Create an instance of {@link RecPmtInqOut }
     * 
     */
    public RecPmtInqOut createRecPmtInqOut() {
        return new RecPmtInqOut();
    }

    /**
     * Create an instance of {@link RecPmtInqRsType }
     * 
     */
    public RecPmtInqRsType createRecPmtInqRsType() {
        return new RecPmtInqRsType();
    }

    /**
     * Create an instance of {@link RecPmtModInp }
     * 
     */
    public RecPmtModInp createRecPmtModInp() {
        return new RecPmtModInp();
    }

    /**
     * Create an instance of {@link RecPmtModRq }
     * 
     */
    public RecPmtModRq createRecPmtModRq() {
        return new RecPmtModRq();
    }

    /**
     * Create an instance of {@link RecPmtModOut }
     * 
     */
    public RecPmtModOut createRecPmtModOut() {
        return new RecPmtModOut();
    }

    /**
     * Create an instance of {@link RecPmtModRs }
     * 
     */
    public RecPmtModRs createRecPmtModRs() {
        return new RecPmtModRs();
    }

    /**
     * Create an instance of {@link RecPmtSyncInp }
     * 
     */
    public RecPmtSyncInp createRecPmtSyncInp() {
        return new RecPmtSyncInp();
    }

    /**
     * Create an instance of {@link RecPmtSyncRq }
     * 
     */
    public RecPmtSyncRq createRecPmtSyncRq() {
        return new RecPmtSyncRq();
    }

    /**
     * Create an instance of {@link RecPmtSyncOut }
     * 
     */
    public RecPmtSyncOut createRecPmtSyncOut() {
        return new RecPmtSyncOut();
    }

    /**
     * Create an instance of {@link RecPmtSyncRs }
     * 
     */
    public RecPmtSyncRs createRecPmtSyncRs() {
        return new RecPmtSyncRs();
    }

    /**
     * Create an instance of {@link RecPmtMsgRec }
     * 
     */
    public RecPmtMsgRec createRecPmtMsgRec() {
        return new RecPmtMsgRec();
    }

    /**
     * Create an instance of {@link RecXferAddInp }
     * 
     */
    public RecXferAddInp createRecXferAddInp() {
        return new RecXferAddInp();
    }

    /**
     * Create an instance of {@link RecXferAddRqType }
     * 
     */
    public RecXferAddRqType createRecXferAddRqType() {
        return new RecXferAddRqType();
    }

    /**
     * Create an instance of {@link RecXferAddOut }
     * 
     */
    public RecXferAddOut createRecXferAddOut() {
        return new RecXferAddOut();
    }

    /**
     * Create an instance of {@link RecXferAddRsType }
     * 
     */
    public RecXferAddRsType createRecXferAddRsType() {
        return new RecXferAddRsType();
    }

    /**
     * Create an instance of {@link RecXferCanInp }
     * 
     */
    public RecXferCanInp createRecXferCanInp() {
        return new RecXferCanInp();
    }

    /**
     * Create an instance of {@link RecXferCanRqType }
     * 
     */
    public RecXferCanRqType createRecXferCanRqType() {
        return new RecXferCanRqType();
    }

    /**
     * Create an instance of {@link RecXferCanOut }
     * 
     */
    public RecXferCanOut createRecXferCanOut() {
        return new RecXferCanOut();
    }

    /**
     * Create an instance of {@link RecXferCanRsType }
     * 
     */
    public RecXferCanRsType createRecXferCanRsType() {
        return new RecXferCanRsType();
    }

    /**
     * Create an instance of {@link RecXferInqInp }
     * 
     */
    public RecXferInqInp createRecXferInqInp() {
        return new RecXferInqInp();
    }

    /**
     * Create an instance of {@link RecXferInqRqType }
     * 
     */
    public RecXferInqRqType createRecXferInqRqType() {
        return new RecXferInqRqType();
    }

    /**
     * Create an instance of {@link RecXferInqOut }
     * 
     */
    public RecXferInqOut createRecXferInqOut() {
        return new RecXferInqOut();
    }

    /**
     * Create an instance of {@link RecXferInqRsType }
     * 
     */
    public RecXferInqRsType createRecXferInqRsType() {
        return new RecXferInqRsType();
    }

    /**
     * Create an instance of {@link RecXferModInp }
     * 
     */
    public RecXferModInp createRecXferModInp() {
        return new RecXferModInp();
    }

    /**
     * Create an instance of {@link RecXferModRqType }
     * 
     */
    public RecXferModRqType createRecXferModRqType() {
        return new RecXferModRqType();
    }

    /**
     * Create an instance of {@link RecXferModOut }
     * 
     */
    public RecXferModOut createRecXferModOut() {
        return new RecXferModOut();
    }

    /**
     * Create an instance of {@link RecXferModRsType }
     * 
     */
    public RecXferModRsType createRecXferModRsType() {
        return new RecXferModRsType();
    }

    /**
     * Create an instance of {@link SignonInp }
     * 
     */
    public SignonInp createSignonInp() {
        return new SignonInp();
    }

    /**
     * Create an instance of {@link SignonOut }
     * 
     */
    public SignonOut createSignonOut() {
        return new SignonOut();
    }

    /**
     * Create an instance of {@link SignoffInp }
     * 
     */
    public SignoffInp createSignoffInp() {
        return new SignoffInp();
    }

    /**
     * Create an instance of {@link SignoffRq }
     * 
     */
    public SignoffRq createSignoffRq() {
        return new SignoffRq();
    }

    /**
     * Create an instance of {@link SignoffOut }
     * 
     */
    public SignoffOut createSignoffOut() {
        return new SignoffOut();
    }

    /**
     * Create an instance of {@link SignoffRs }
     * 
     */
    public SignoffRs createSignoffRs() {
        return new SignoffRs();
    }

    /**
     * Create an instance of {@link StdPayeeInqInp }
     * 
     */
    public StdPayeeInqInp createStdPayeeInqInp() {
        return new StdPayeeInqInp();
    }

    /**
     * Create an instance of {@link StdPayeeInqRq }
     * 
     */
    public StdPayeeInqRq createStdPayeeInqRq() {
        return new StdPayeeInqRq();
    }

    /**
     * Create an instance of {@link StdPayeeInqOut }
     * 
     */
    public StdPayeeInqOut createStdPayeeInqOut() {
        return new StdPayeeInqOut();
    }

    /**
     * Create an instance of {@link StdPayeeInqRs }
     * 
     */
    public StdPayeeInqRs createStdPayeeInqRs() {
        return new StdPayeeInqRs();
    }

    /**
     * Create an instance of {@link StdPayeeRec }
     * 
     */
    public StdPayeeRec createStdPayeeRec() {
        return new StdPayeeRec();
    }

    /**
     * Create an instance of {@link StdPayeeInfo }
     * 
     */
    public StdPayeeInfo createStdPayeeInfo() {
        return new StdPayeeInfo();
    }

    /**
     * Create an instance of {@link StmtDeliveryInqInp }
     * 
     */
    public StmtDeliveryInqInp createStmtDeliveryInqInp() {
        return new StmtDeliveryInqInp();
    }

    /**
     * Create an instance of {@link StmtDeliveryInqRq }
     * 
     */
    public StmtDeliveryInqRq createStmtDeliveryInqRq() {
        return new StmtDeliveryInqRq();
    }

    /**
     * Create an instance of {@link StmtDeliveryInqOut }
     * 
     */
    public StmtDeliveryInqOut createStmtDeliveryInqOut() {
        return new StmtDeliveryInqOut();
    }

    /**
     * Create an instance of {@link StmtDeliveryInqRs }
     * 
     */
    public StmtDeliveryInqRs createStmtDeliveryInqRs() {
        return new StmtDeliveryInqRs();
    }

    /**
     * Create an instance of {@link StmtDeliveryModInp }
     * 
     */
    public StmtDeliveryModInp createStmtDeliveryModInp() {
        return new StmtDeliveryModInp();
    }

    /**
     * Create an instance of {@link StmtDeliveryModRq }
     * 
     */
    public StmtDeliveryModRq createStmtDeliveryModRq() {
        return new StmtDeliveryModRq();
    }

    /**
     * Create an instance of {@link StmtDeliveryModOut }
     * 
     */
    public StmtDeliveryModOut createStmtDeliveryModOut() {
        return new StmtDeliveryModOut();
    }

    /**
     * Create an instance of {@link StmtDeliveryModRs }
     * 
     */
    public StmtDeliveryModRs createStmtDeliveryModRs() {
        return new StmtDeliveryModRs();
    }

    /**
     * Create an instance of {@link StopChkAddInp }
     * 
     */
    public StopChkAddInp createStopChkAddInp() {
        return new StopChkAddInp();
    }

    /**
     * Create an instance of {@link StopChkAddRq }
     * 
     */
    public StopChkAddRq createStopChkAddRq() {
        return new StopChkAddRq();
    }

    /**
     * Create an instance of {@link StopChkInfo }
     * 
     */
    public StopChkInfo createStopChkInfo() {
        return new StopChkInfo();
    }

    /**
     * Create an instance of {@link StopChkAddOut }
     * 
     */
    public StopChkAddOut createStopChkAddOut() {
        return new StopChkAddOut();
    }

    /**
     * Create an instance of {@link StopChkAddRs }
     * 
     */
    public StopChkAddRs createStopChkAddRs() {
        return new StopChkAddRs();
    }

    /**
     * Create an instance of {@link StopChkRec }
     * 
     */
    public StopChkRec createStopChkRec() {
        return new StopChkRec();
    }

    /**
     * Create an instance of {@link StopChkCanInp }
     * 
     */
    public StopChkCanInp createStopChkCanInp() {
        return new StopChkCanInp();
    }

    /**
     * Create an instance of {@link StopChkCanRq }
     * 
     */
    public StopChkCanRq createStopChkCanRq() {
        return new StopChkCanRq();
    }

    /**
     * Create an instance of {@link StopChkCanOut }
     * 
     */
    public StopChkCanOut createStopChkCanOut() {
        return new StopChkCanOut();
    }

    /**
     * Create an instance of {@link StopChkCanRs }
     * 
     */
    public StopChkCanRs createStopChkCanRs() {
        return new StopChkCanRs();
    }

    /**
     * Create an instance of {@link StopChkInqInp }
     * 
     */
    public StopChkInqInp createStopChkInqInp() {
        return new StopChkInqInp();
    }

    /**
     * Create an instance of {@link StopChkInqRq }
     * 
     */
    public StopChkInqRq createStopChkInqRq() {
        return new StopChkInqRq();
    }

    /**
     * Create an instance of {@link StopChkInqOut }
     * 
     */
    public StopChkInqOut createStopChkInqOut() {
        return new StopChkInqOut();
    }

    /**
     * Create an instance of {@link StopChkInqRs }
     * 
     */
    public StopChkInqRs createStopChkInqRs() {
        return new StopChkInqRs();
    }

    /**
     * Create an instance of {@link StopPayAddInp }
     * 
     */
    public StopPayAddInp createStopPayAddInp() {
        return new StopPayAddInp();
    }

    /**
     * Create an instance of {@link StopPayAddRq }
     * 
     */
    public StopPayAddRq createStopPayAddRq() {
        return new StopPayAddRq();
    }

    /**
     * Create an instance of {@link QualifiedAmtType }
     * 
     */
    public QualifiedAmtType createQualifiedAmtType() {
        return new QualifiedAmtType();
    }

    /**
     * Create an instance of {@link StopPayInfoType }
     * 
     */
    public StopPayInfoType createStopPayInfoType() {
        return new StopPayInfoType();
    }

    /**
     * Create an instance of {@link ACHPmtInfo }
     * 
     */
    public ACHPmtInfo createACHPmtInfo() {
        return new ACHPmtInfo();
    }

    /**
     * Create an instance of {@link ACHPmtInfoType }
     * 
     */
    public ACHPmtInfoType createACHPmtInfoType() {
        return new ACHPmtInfoType();
    }

    /**
     * Create an instance of {@link StopPayAddOut }
     * 
     */
    public StopPayAddOut createStopPayAddOut() {
        return new StopPayAddOut();
    }

    /**
     * Create an instance of {@link StopPayAddRs }
     * 
     */
    public StopPayAddRs createStopPayAddRs() {
        return new StopPayAddRs();
    }

    /**
     * Create an instance of {@link StopPayRecType }
     * 
     */
    public StopPayRecType createStopPayRecType() {
        return new StopPayRecType();
    }

    /**
     * Create an instance of {@link StopPayCanInp }
     * 
     */
    public StopPayCanInp createStopPayCanInp() {
        return new StopPayCanInp();
    }

    /**
     * Create an instance of {@link StopPayCanRq }
     * 
     */
    public StopPayCanRq createStopPayCanRq() {
        return new StopPayCanRq();
    }

    /**
     * Create an instance of {@link StopPayCanOut }
     * 
     */
    public StopPayCanOut createStopPayCanOut() {
        return new StopPayCanOut();
    }

    /**
     * Create an instance of {@link StopPayCanRs }
     * 
     */
    public StopPayCanRs createStopPayCanRs() {
        return new StopPayCanRs();
    }

    /**
     * Create an instance of {@link StopPayInqInp }
     * 
     */
    public StopPayInqInp createStopPayInqInp() {
        return new StopPayInqInp();
    }

    /**
     * Create an instance of {@link StopPayInqRq }
     * 
     */
    public StopPayInqRq createStopPayInqRq() {
        return new StopPayInqRq();
    }

    /**
     * Create an instance of {@link StopPayInqOut }
     * 
     */
    public StopPayInqOut createStopPayInqOut() {
        return new StopPayInqOut();
    }

    /**
     * Create an instance of {@link StopPayInqRs }
     * 
     */
    public StopPayInqRs createStopPayInqRs() {
        return new StopPayInqRs();
    }

    /**
     * Create an instance of {@link SvcAcctInqInp }
     * 
     */
    public SvcAcctInqInp createSvcAcctInqInp() {
        return new SvcAcctInqInp();
    }

    /**
     * Create an instance of {@link SvcAcctInqRq }
     * 
     */
    public SvcAcctInqRq createSvcAcctInqRq() {
        return new SvcAcctInqRq();
    }

    /**
     * Create an instance of {@link SvcAcctInqOut }
     * 
     */
    public SvcAcctInqOut createSvcAcctInqOut() {
        return new SvcAcctInqOut();
    }

    /**
     * Create an instance of {@link SvcAcctInqRs }
     * 
     */
    public SvcAcctInqRs createSvcAcctInqRs() {
        return new SvcAcctInqRs();
    }

    /**
     * Create an instance of {@link CustSvcRec }
     * 
     */
    public CustSvcRec createCustSvcRec() {
        return new CustSvcRec();
    }

    /**
     * Create an instance of {@link CustSvcInfo }
     * 
     */
    public CustSvcInfo createCustSvcInfo() {
        return new CustSvcInfo();
    }

    /**
     * Create an instance of {@link XferAddInp }
     * 
     */
    public XferAddInp createXferAddInp() {
        return new XferAddInp();
    }

    /**
     * Create an instance of {@link XferAddRq }
     * 
     */
    public XferAddRq createXferAddRq() {
        return new XferAddRq();
    }

    /**
     * Create an instance of {@link XferInfo }
     * 
     */
    public XferInfo createXferInfo() {
        return new XferInfo();
    }

    /**
     * Create an instance of {@link LoanAcctIdFrom }
     * 
     */
    public LoanAcctIdFrom createLoanAcctIdFrom() {
        return new LoanAcctIdFrom();
    }

    /**
     * Create an instance of {@link CardAcctIdTo }
     * 
     */
    public CardAcctIdTo createCardAcctIdTo() {
        return new CardAcctIdTo();
    }

    /**
     * Create an instance of {@link LoanAcctIdTo }
     * 
     */
    public LoanAcctIdTo createLoanAcctIdTo() {
        return new LoanAcctIdTo();
    }

    /**
     * Create an instance of {@link XferDetailType }
     * 
     */
    public XferDetailType createXferDetailType() {
        return new XferDetailType();
    }

    /**
     * Create an instance of {@link XferAddOut }
     * 
     */
    public XferAddOut createXferAddOut() {
        return new XferAddOut();
    }

    /**
     * Create an instance of {@link XferAddRs }
     * 
     */
    public XferAddRs createXferAddRs() {
        return new XferAddRs();
    }

    /**
     * Create an instance of {@link XferRec }
     * 
     */
    public XferRec createXferRec() {
        return new XferRec();
    }

    /**
     * Create an instance of {@link XferStatus }
     * 
     */
    public XferStatus createXferStatus() {
        return new XferStatus();
    }

    /**
     * Create an instance of {@link XferCanInp }
     * 
     */
    public XferCanInp createXferCanInp() {
        return new XferCanInp();
    }

    /**
     * Create an instance of {@link XferCanRqType }
     * 
     */
    public XferCanRqType createXferCanRqType() {
        return new XferCanRqType();
    }

    /**
     * Create an instance of {@link XferCanOut }
     * 
     */
    public XferCanOut createXferCanOut() {
        return new XferCanOut();
    }

    /**
     * Create an instance of {@link XferCanRsType }
     * 
     */
    public XferCanRsType createXferCanRsType() {
        return new XferCanRsType();
    }

    /**
     * Create an instance of {@link XferInqInp }
     * 
     */
    public XferInqInp createXferInqInp() {
        return new XferInqInp();
    }

    /**
     * Create an instance of {@link XferInqRqType }
     * 
     */
    public XferInqRqType createXferInqRqType() {
        return new XferInqRqType();
    }

    /**
     * Create an instance of {@link XferInqOut }
     * 
     */
    public XferInqOut createXferInqOut() {
        return new XferInqOut();
    }

    /**
     * Create an instance of {@link XferInqRsType }
     * 
     */
    public XferInqRsType createXferInqRsType() {
        return new XferInqRsType();
    }

    /**
     * Create an instance of {@link XferModInp }
     * 
     */
    public XferModInp createXferModInp() {
        return new XferModInp();
    }

    /**
     * Create an instance of {@link XferModRqType }
     * 
     */
    public XferModRqType createXferModRqType() {
        return new XferModRqType();
    }

    /**
     * Create an instance of {@link XferModOut }
     * 
     */
    public XferModOut createXferModOut() {
        return new XferModOut();
    }

    /**
     * Create an instance of {@link XferModRsType }
     * 
     */
    public XferModRsType createXferModRsType() {
        return new XferModRsType();
    }

    /**
     * Create an instance of {@link RecXferRecType }
     * 
     */
    public RecXferRecType createRecXferRecType() {
        return new RecXferRecType();
    }

    /**
     * Create an instance of {@link CriteriaDetailsType }
     * 
     */
    public CriteriaDetailsType createCriteriaDetailsType() {
        return new CriteriaDetailsType();
    }

    /**
     * Create an instance of {@link EMVRqDataType }
     * 
     */
    public EMVRqDataType createEMVRqDataType() {
        return new EMVRqDataType();
    }

    /**
     * Create an instance of {@link EMVRsDataType }
     * 
     */
    public EMVRsDataType createEMVRsDataType() {
        return new EMVRsDataType();
    }

    /**
     * Create an instance of {@link GenAppAcctIdType }
     * 
     */
    public GenAppAcctIdType createGenAppAcctIdType() {
        return new GenAppAcctIdType();
    }

    /**
     * Create an instance of {@link GenAppInfoType }
     * 
     */
    public GenAppInfoType createGenAppInfoType() {
        return new GenAppInfoType();
    }

    /**
     * Create an instance of {@link GenApplicantType }
     * 
     */
    public GenApplicantType createGenApplicantType() {
        return new GenApplicantType();
    }

    /**
     * Create an instance of {@link GenAppRecType }
     * 
     */
    public GenAppRecType createGenAppRecType() {
        return new GenAppRecType();
    }

    /**
     * Create an instance of {@link GenAppStatusType }
     * 
     */
    public GenAppStatusType createGenAppStatusType() {
        return new GenAppStatusType();
    }

    /**
     * Create an instance of {@link IdentCharacterDataType }
     * 
     */
    public IdentCharacterDataType createIdentCharacterDataType() {
        return new IdentCharacterDataType();
    }

    /**
     * Create an instance of {@link IssScriptDataType }
     * 
     */
    public IssScriptDataType createIssScriptDataType() {
        return new IssScriptDataType();
    }

    /**
     * Create an instance of {@link IssPrePostScriptDataType }
     * 
     */
    public IssPrePostScriptDataType createIssPrePostScriptDataType() {
        return new IssPrePostScriptDataType();
    }

    /**
     * Create an instance of {@link MsgAuthCodeType }
     * 
     */
    public MsgAuthCodeType createMsgAuthCodeType() {
        return new MsgAuthCodeType();
    }

    /**
     * Create an instance of {@link PartyAcctRelType }
     * 
     */
    public PartyAcctRelType createPartyAcctRelType() {
        return new PartyAcctRelType();
    }

    /**
     * Create an instance of {@link PartyAcctRelInfoType }
     * 
     */
    public PartyAcctRelInfoType createPartyAcctRelInfoType() {
        return new PartyAcctRelInfoType();
    }

    /**
     * Create an instance of {@link PartyAcctRelRecType }
     * 
     */
    public PartyAcctRelRecType createPartyAcctRelRecType() {
        return new PartyAcctRelRecType();
    }

    /**
     * Create an instance of {@link PartyAcctRelStatusType }
     * 
     */
    public PartyAcctRelStatusType createPartyAcctRelStatusType() {
        return new PartyAcctRelStatusType();
    }

    /**
     * Create an instance of {@link PointOfServiceDataType }
     * 
     */
    public PointOfServiceDataType createPointOfServiceDataType() {
        return new PointOfServiceDataType();
    }

    /**
     * Create an instance of {@link POSSecurityType }
     * 
     */
    public POSSecurityType createPOSSecurityType() {
        return new POSSecurityType();
    }

    /**
     * Create an instance of {@link POSCapabilitiesType }
     * 
     */
    public POSCapabilitiesType createPOSCapabilitiesType() {
        return new POSCapabilitiesType();
    }

    /**
     * Create an instance of {@link POSAgentType }
     * 
     */
    public POSAgentType createPOSAgentType() {
        return new POSAgentType();
    }

    /**
     * Create an instance of {@link PswdDeliveryType }
     * 
     */
    public PswdDeliveryType createPswdDeliveryType() {
        return new PswdDeliveryType();
    }

    /**
     * Create an instance of {@link TINInfoType }
     * 
     */
    public TINInfoType createTINInfoType() {
        return new TINInfoType();
    }

    /**
     * Create an instance of {@link DepAppInfoType }
     * 
     */
    public DepAppInfoType createDepAppInfoType() {
        return new DepAppInfoType();
    }

    /**
     * Create an instance of {@link DepAppAcctIdType }
     * 
     */
    public DepAppAcctIdType createDepAppAcctIdType() {
        return new DepAppAcctIdType();
    }

    /**
     * Create an instance of {@link DepAppRecType }
     * 
     */
    public DepAppRecType createDepAppRecType() {
        return new DepAppRecType();
    }

    /**
     * Create an instance of {@link DepAppStatusType }
     * 
     */
    public DepAppStatusType createDepAppStatusType() {
        return new DepAppStatusType();
    }

    /**
     * Create an instance of {@link DepApplicantType }
     * 
     */
    public DepApplicantType createDepApplicantType() {
        return new DepApplicantType();
    }

    /**
     * Create an instance of {@link OverdraftFundingType }
     * 
     */
    public OverdraftFundingType createOverdraftFundingType() {
        return new OverdraftFundingType();
    }

    /**
     * Create an instance of {@link FundingInfoType }
     * 
     */
    public FundingInfoType createFundingInfoType() {
        return new FundingInfoType();
    }

    /**
     * Create an instance of {@link LoanAcctNoteHistoryDetailRec.TransactionAmount }
     * 
     */
    public LoanAcctNoteHistoryDetailRec.TransactionAmount createLoanAcctNoteHistoryDetailRecTransactionAmount() {
        return new LoanAcctNoteHistoryDetailRec.TransactionAmount();
    }

    /**
     * Create an instance of {@link LoanAcctNoteHistoryDetailRec.PrincipalAmount }
     * 
     */
    public LoanAcctNoteHistoryDetailRec.PrincipalAmount createLoanAcctNoteHistoryDetailRecPrincipalAmount() {
        return new LoanAcctNoteHistoryDetailRec.PrincipalAmount();
    }

    /**
     * Create an instance of {@link LoanAcctNoteHistoryDetailRec.InterestAmount }
     * 
     */
    public LoanAcctNoteHistoryDetailRec.InterestAmount createLoanAcctNoteHistoryDetailRecInterestAmount() {
        return new LoanAcctNoteHistoryDetailRec.InterestAmount();
    }

    /**
     * Create an instance of {@link LoanAcctNoteHistoryDetailRec.EscrowAmount }
     * 
     */
    public LoanAcctNoteHistoryDetailRec.EscrowAmount createLoanAcctNoteHistoryDetailRecEscrowAmount() {
        return new LoanAcctNoteHistoryDetailRec.EscrowAmount();
    }

    /**
     * Create an instance of {@link LoanAcctNoteHistoryDetailRec.Fees }
     * 
     */
    public LoanAcctNoteHistoryDetailRec.Fees createLoanAcctNoteHistoryDetailRecFees() {
        return new LoanAcctNoteHistoryDetailRec.Fees();
    }

    /**
     * Create an instance of {@link LoanAcctNoteHistoryDetailRec.PrincipalBalance }
     * 
     */
    public LoanAcctNoteHistoryDetailRec.PrincipalBalance createLoanAcctNoteHistoryDetailRecPrincipalBalance() {
        return new LoanAcctNoteHistoryDetailRec.PrincipalBalance();
    }

    /**
     * Create an instance of {@link DriversLicenseType }
     * 
     */
    public DriversLicenseType createDriversLicenseType() {
        return new DriversLicenseType();
    }

    /**
     * Create an instance of {@link IncomeType }
     * 
     */
    public IncomeType createIncomeType() {
        return new IncomeType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link PassportType }
     * 
     */
    public PassportType createPassportType() {
        return new PassportType();
    }

    /**
     * Create an instance of {@link StateIdType }
     * 
     */
    public StateIdType createStateIdType() {
        return new StateIdType();
    }

    /**
     * Create an instance of {@link StructRmtInfoType }
     * 
     */
    public StructRmtInfoType createStructRmtInfoType() {
        return new StructRmtInfoType();
    }

    /**
     * Create an instance of {@link ForExDealStatusType }
     * 
     */
    public ForExDealStatusType createForExDealStatusType() {
        return new ForExDealStatusType();
    }

    /**
     * Create an instance of {@link RatesType }
     * 
     */
    public RatesType createRatesType() {
        return new RatesType();
    }

    /**
     * Create an instance of {@link PersonInfoType }
     * 
     */
    public PersonInfoType createPersonInfoType() {
        return new PersonInfoType();
    }

    /**
     * Create an instance of {@link ForExDealSyncObjType }
     * 
     */
    public ForExDealSyncObjType createForExDealSyncObjType() {
        return new ForExDealSyncObjType();
    }

    /**
     * Create an instance of {@link SettlementSummaryType }
     * 
     */
    public SettlementSummaryType createSettlementSummaryType() {
        return new SettlementSummaryType();
    }

    /**
     * Create an instance of {@link GovIssueIdentType }
     * 
     */
    public GovIssueIdentType createGovIssueIdentType() {
        return new GovIssueIdentType();
    }

    /**
     * Create an instance of {@link OtherIdentDocType }
     * 
     */
    public OtherIdentDocType createOtherIdentDocType() {
        return new OtherIdentDocType();
    }

    /**
     * Create an instance of {@link TotalAmt }
     * 
     */
    public TotalAmt createTotalAmt() {
        return new TotalAmt();
    }

    /**
     * Create an instance of {@link BSPReferToType }
     * 
     */
    public BSPReferToType createBSPReferToType() {
        return new BSPReferToType();
    }

    /**
     * Create an instance of {@link BillerInfoType }
     * 
     */
    public BillerInfoType createBillerInfoType() {
        return new BillerInfoType();
    }

    /**
     * Create an instance of {@link BillerAcctIdInfoType }
     * 
     */
    public BillerAcctIdInfoType createBillerAcctIdInfoType() {
        return new BillerAcctIdInfoType();
    }

    /**
     * Create an instance of {@link BillerStatusType }
     * 
     */
    public BillerStatusType createBillerStatusType() {
        return new BillerStatusType();
    }

    /**
     * Create an instance of {@link LogoType }
     * 
     */
    public LogoType createLogoType() {
        return new LogoType();
    }

    /**
     * Create an instance of {@link SecretPromptType }
     * 
     */
    public SecretPromptType createSecretPromptType() {
        return new SecretPromptType();
    }

    /**
     * Create an instance of {@link IndustInfoType }
     * 
     */
    public IndustInfoType createIndustInfoType() {
        return new IndustInfoType();
    }

    /**
     * Create an instance of {@link BillInfoType }
     * 
     */
    public BillInfoType createBillInfoType() {
        return new BillInfoType();
    }

    /**
     * Create an instance of {@link BillSummAmtType }
     * 
     */
    public BillSummAmtType createBillSummAmtType() {
        return new BillSummAmtType();
    }

    /**
     * Create an instance of {@link BillSummSubAmtType }
     * 
     */
    public BillSummSubAmtType createBillSummSubAmtType() {
        return new BillSummSubAmtType();
    }

    /**
     * Create an instance of {@link BillPmtStatusType }
     * 
     */
    public BillPmtStatusType createBillPmtStatusType() {
        return new BillPmtStatusType();
    }

    /**
     * Create an instance of {@link BillStatusType }
     * 
     */
    public BillStatusType createBillStatusType() {
        return new BillStatusType();
    }

    /**
     * Create an instance of {@link BillPmtStatusCountsType }
     * 
     */
    public BillPmtStatusCountsType createBillPmtStatusCountsType() {
        return new BillPmtStatusCountsType();
    }

    /**
     * Create an instance of {@link BillStatusCountsType }
     * 
     */
    public BillStatusCountsType createBillStatusCountsType() {
        return new BillStatusCountsType();
    }

    /**
     * Create an instance of {@link PresAcctIdType }
     * 
     */
    public PresAcctIdType createPresAcctIdType() {
        return new PresAcctIdType();
    }

    /**
     * Create an instance of {@link StmtImageType }
     * 
     */
    public StmtImageType createStmtImageType() {
        return new StmtImageType();
    }

    /**
     * Create an instance of {@link BankAcctImgSrchInpType }
     * 
     */
    public BankAcctImgSrchInpType createBankAcctImgSrchInpType() {
        return new BankAcctImgSrchInpType();
    }

    /**
     * Create an instance of {@link BankAcctImgSrchOutType }
     * 
     */
    public BankAcctImgSrchOutType createBankAcctImgSrchOutType() {
        return new BankAcctImgSrchOutType();
    }

    /**
     * Create an instance of {@link BankAcctTrnImgInqInpType }
     * 
     */
    public BankAcctTrnImgInqInpType createBankAcctTrnImgInqInpType() {
        return new BankAcctTrnImgInqInpType();
    }

    /**
     * Create an instance of {@link BankAcctTrnImgInqOutType }
     * 
     */
    public BankAcctTrnImgInqOutType createBankAcctTrnImgInqOutType() {
        return new BankAcctTrnImgInqOutType();
    }

    /**
     * Create an instance of {@link CCAcctStmtInqInpType }
     * 
     */
    public CCAcctStmtInqInpType createCCAcctStmtInqInpType() {
        return new CCAcctStmtInqInpType();
    }

    /**
     * Create an instance of {@link CCAcctStmtInqOutType }
     * 
     */
    public CCAcctStmtInqOutType createCCAcctStmtInqOutType() {
        return new CCAcctStmtInqOutType();
    }

    /**
     * Create an instance of {@link DepAcctStmtInqInpType }
     * 
     */
    public DepAcctStmtInqInpType createDepAcctStmtInqInpType() {
        return new DepAcctStmtInqInpType();
    }

    /**
     * Create an instance of {@link DepAcctStmtInqOutType }
     * 
     */
    public DepAcctStmtInqOutType createDepAcctStmtInqOutType() {
        return new DepAcctStmtInqOutType();
    }

    /**
     * Create an instance of {@link LoanAcctStmtInqInpType }
     * 
     */
    public LoanAcctStmtInqInpType createLoanAcctStmtInqInpType() {
        return new LoanAcctStmtInqInpType();
    }

    /**
     * Create an instance of {@link LoanAcctStmtInqOutType }
     * 
     */
    public LoanAcctStmtInqOutType createLoanAcctStmtInqOutType() {
        return new LoanAcctStmtInqOutType();
    }

    /**
     * Create an instance of {@link DepAcctStmtInqRqType }
     * 
     */
    public DepAcctStmtInqRqType createDepAcctStmtInqRqType() {
        return new DepAcctStmtInqRqType();
    }

    /**
     * Create an instance of {@link LoanAcctStmtInqRqType }
     * 
     */
    public LoanAcctStmtInqRqType createLoanAcctStmtInqRqType() {
        return new LoanAcctStmtInqRqType();
    }

    /**
     * Create an instance of {@link LoanAcctStmtInqRsType }
     * 
     */
    public LoanAcctStmtInqRsType createLoanAcctStmtInqRsType() {
        return new LoanAcctStmtInqRsType();
    }

    /**
     * Create an instance of {@link SearchType }
     * 
     */
    public SearchType createSearchType() {
        return new SearchType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SignonRole")
    public JAXBElement<String> createSignonRole(String value) {
        return new JAXBElement<String>(_SignonRole_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SPName")
    public JAXBElement<String> createSPName(String value) {
        return new JAXBElement<String>(_SPName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CustPermId")
    public JAXBElement<String> createCustPermId(String value) {
        return new JAXBElement<String>(_CustPermId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CustLoginId")
    public JAXBElement<String> createCustLoginId(String value) {
        return new JAXBElement<String>(_CustLoginId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CryptType")
    public JAXBElement<String> createCryptType(String value) {
        return new JAXBElement<String>(_CryptType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Pswd")
    public JAXBElement<String> createPswd(String value) {
        return new JAXBElement<String>(_Pswd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ContentType")
    public JAXBElement<String> createContentType(String value) {
        return new JAXBElement<String>(_ContentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BinLength")
    public JAXBElement<Long> createBinLength(Long value) {
        return new JAXBElement<Long>(_BinLength_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BinData")
    public JAXBElement<byte[]> createBinData(byte[] value) {
        return new JAXBElement<byte[]>(_BinData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenSessKey")
    public JAXBElement<Boolean> createGenSessKey(Boolean value) {
        return new JAXBElement<Boolean>(_GenSessKey_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SessKey")
    public JAXBElement<String> createSessKey(String value) {
        return new JAXBElement<String>(_SessKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CustLangPref")
    public JAXBElement<String> createCustLangPref(String value) {
        return new JAXBElement<String>(_CustLangPref_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Org")
    public JAXBElement<String> createOrg(String value) {
        return new JAXBElement<String>(_Org_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ClientDt")
    public JAXBElement<XMLGregorianCalendar> createClientDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClientDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SuppressEcho")
    public JAXBElement<Boolean> createSuppressEcho(Boolean value) {
        return new JAXBElement<Boolean>(_SuppressEcho_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TunneledData")
    public JAXBElement<MapElement> createTunneledData(MapElement value) {
        return new JAXBElement<MapElement>(_TunneledData_QNAME, MapElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RqUID")
    public JAXBElement<String> createRqUID(String value) {
        return new JAXBElement<String>(_RqUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AsyncRqUID")
    public JAXBElement<String> createAsyncRqUID(String value) {
        return new JAXBElement<String>(_AsyncRqUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BankId")
    public JAXBElement<String> createBankId(String value) {
        return new JAXBElement<String>(_BankId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BankIdType")
    public JAXBElement<String> createBankIdType(String value) {
        return new JAXBElement<String>(_BankIdType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BranchId")
    public JAXBElement<String> createBranchId(String value) {
        return new JAXBElement<String>(_BranchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RefType")
    public JAXBElement<String> createRefType(String value) {
        return new JAXBElement<String>(_RefType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RefId")
    public JAXBElement<String> createRefId(String value) {
        return new JAXBElement<String>(_RefId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PostAddrType")
    public JAXBElement<String> createPostAddrType(String value) {
        return new JAXBElement<String>(_PostAddrType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IsPreferredAddr")
    public JAXBElement<Boolean> createIsPreferredAddr(Boolean value) {
        return new JAXBElement<Boolean>(_IsPreferredAddr_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Addr1")
    public JAXBElement<String> createAddr1(String value) {
        return new JAXBElement<String>(_Addr1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Addr2")
    public JAXBElement<String> createAddr2(String value) {
        return new JAXBElement<String>(_Addr2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Addr3")
    public JAXBElement<String> createAddr3(String value) {
        return new JAXBElement<String>(_Addr3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "City")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StateProv")
    public JAXBElement<String> createStateProv(String value) {
        return new JAXBElement<String>(_StateProv_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PostalCode")
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(_PostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "County")
    public JAXBElement<String> createCounty(String value) {
        return new JAXBElement<String>(_County_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Channel")
    public JAXBElement<String> createChannel(String value) {
        return new JAXBElement<String>(_Channel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Affiliate")
    public JAXBElement<String> createAffiliate(String value) {
        return new JAXBElement<String>(_Affiliate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctId")
    public JAXBElement<String> createAcctId(String value) {
        return new JAXBElement<String>(_AcctId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctType")
    public JAXBElement<String> createAcctType(String value) {
        return new JAXBElement<String>(_AcctType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctCur")
    public JAXBElement<String> createAcctCur(String value) {
        return new JAXBElement<String>(_AcctCur_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StatusCode")
    public JAXBElement<Long> createStatusCode(Long value) {
        return new JAXBElement<Long>(_StatusCode_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ServerStatusCode")
    public JAXBElement<String> createServerStatusCode(String value) {
        return new JAXBElement<String>(_ServerStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Severity")
    public JAXBElement<String> createSeverity(String value) {
        return new JAXBElement<String>(_Severity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StatusDesc")
    public JAXBElement<String> createStatusDesc(String value) {
        return new JAXBElement<String>(_StatusDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AvailDt")
    public JAXBElement<XMLGregorianCalendar> createAvailDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AvailDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ExpDt")
    public JAXBElement<XMLGregorianCalendar> createExpDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExpDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ServerDt")
    public JAXBElement<XMLGregorianCalendar> createServerDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ServerDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Language")
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctGenInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctGenInfo")
    public JAXBElement<AcctGenInfoType> createAcctGenInfo(AcctGenInfoType value) {
        return new JAXBElement<AcctGenInfoType>(_AcctGenInfo_QNAME, AcctGenInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctGenRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctGenRec")
    public JAXBElement<AcctGenRecType> createAcctGenRec(AcctGenRecType value) {
        return new JAXBElement<AcctGenRecType>(_AcctGenRec_QNAME, AcctGenRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctKey")
    public JAXBElement<String> createAcctKey(String value) {
        return new JAXBElement<String>(_AcctKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NoteNumber")
    public JAXBElement<String> createNoteNumber(String value) {
        return new JAXBElement<String>(_NoteNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IncBal")
    public JAXBElement<Boolean> createIncBal(Boolean value) {
        return new JAXBElement<Boolean>(_IncBal_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IncExtBal")
    public JAXBElement<Boolean> createIncExtBal(Boolean value) {
        return new JAXBElement<Boolean>(_IncExtBal_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "UpDt")
    public JAXBElement<XMLGregorianCalendar> createUpDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "LastTrnDt")
    public JAXBElement<XMLGregorianCalendar> createLastTrnDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastTrnDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "LastStmtDt")
    public JAXBElement<XMLGregorianCalendar> createLastStmtDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastStmtDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NextStmtDt")
    public JAXBElement<XMLGregorianCalendar> createNextStmtDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NextStmtDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StmtCycle")
    public JAXBElement<String> createStmtCycle(String value) {
        return new JAXBElement<String>(_StmtCycle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NumberOfSigners")
    public JAXBElement<String> createNumberOfSigners(String value) {
        return new JAXBElement<String>(_NumberOfSigners_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Relationship")
    public JAXBElement<String> createRelationship(String value) {
        return new JAXBElement<String>(_Relationship_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CurCode")
    public JAXBElement<String> createCurCode(String value) {
        return new JAXBElement<String>(_CurCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Desc")
    public JAXBElement<String> createDesc(String value) {
        return new JAXBElement<String>(_Desc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AccountTitle")
    public JAXBElement<String> createAccountTitle(String value) {
        return new JAXBElement<String>(_AccountTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Nickname")
    public JAXBElement<String> createNickname(String value) {
        return new JAXBElement<String>(_Nickname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BankAcctStatusCode")
    public JAXBElement<String> createBankAcctStatusCode(String value) {
        return new JAXBElement<String>(_BankAcctStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OpenDt")
    public JAXBElement<XMLGregorianCalendar> createOpenDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpenDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CloseDt")
    public JAXBElement<XMLGregorianCalendar> createCloseDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CloseDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FlagName")
    public JAXBElement<String> createFlagName(String value) {
        return new JAXBElement<String>(_FlagName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FlagValue")
    public JAXBElement<Boolean> createFlagValue(Boolean value) {
        return new JAXBElement<Boolean>(_FlagValue_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BalType")
    public JAXBElement<String> createBalType(String value) {
        return new JAXBElement<String>(_BalType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Amt")
    public JAXBElement<BigDecimal> createAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Amt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "EffDt")
    public JAXBElement<XMLGregorianCalendar> createEffDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EffDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ExtBalType")
    public JAXBElement<String> createExtBalType(String value) {
        return new JAXBElement<String>(_ExtBalType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "LastDepDt")
    public JAXBElement<XMLGregorianCalendar> createLastDepDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastDepDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepMatureDt")
    public JAXBElement<XMLGregorianCalendar> createDepMatureDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DepMatureDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NSFDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NSFDetails")
    public JAXBElement<NSFDetailsType> createNSFDetails(NSFDetailsType value) {
        return new JAXBElement<NSFDetailsType>(_NSFDetails_QNAME, NSFDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "InterestDetails")
    public JAXBElement<InterestDetailsType> createInterestDetails(InterestDetailsType value) {
        return new JAXBElement<InterestDetailsType>(_InterestDetails_QNAME, InterestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Count")
    public JAXBElement<Long> createCount(Long value) {
        return new JAXBElement<Long>(_Count_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TermUnits")
    public JAXBElement<String> createTermUnits(String value) {
        return new JAXBElement<String>(_TermUnits_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DaysCall")
    public JAXBElement<Long> createDaysCall(Long value) {
        return new JAXBElement<Long>(_DaysCall_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DueDt")
    public JAXBElement<XMLGregorianCalendar> createDueDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DueDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "LastPmtDt")
    public JAXBElement<XMLGregorianCalendar> createLastPmtDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastPmtDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Rate")
    public JAXBElement<BigDecimal> createRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Rate_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MatDt")
    public JAXBElement<XMLGregorianCalendar> createMatDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MatDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OrigDt")
    public JAXBElement<XMLGregorianCalendar> createOrigDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrigDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PastDuePmtCount")
    public JAXBElement<Long> createPastDuePmtCount(Long value) {
        return new JAXBElement<Long>(_PastDuePmtCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RemainingPmtCount")
    public JAXBElement<Long> createRemainingPmtCount(Long value) {
        return new JAXBElement<Long>(_RemainingPmtCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Ownership")
    public JAXBElement<String> createOwnership(String value) {
        return new JAXBElement<String>(_Ownership_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctComments")
    public JAXBElement<String> createAcctComments(String value) {
        return new JAXBElement<String>(_AcctComments_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OfficerId")
    public JAXBElement<String> createOfficerId(String value) {
        return new JAXBElement<String>(_OfficerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CRAStateCode")
    public JAXBElement<String> createCRAStateCode(String value) {
        return new JAXBElement<String>(_CRAStateCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CRACountyCode")
    public JAXBElement<String> createCRACountyCode(String value) {
        return new JAXBElement<String>(_CRACountyCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CRACensusTract")
    public JAXBElement<String> createCRACensusTract(String value) {
        return new JAXBElement<String>(_CRACensusTract_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CRASMSACode")
    public JAXBElement<String> createCRASMSACode(String value) {
        return new JAXBElement<String>(_CRASMSACode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CRALoc")
    public JAXBElement<String> createCRALoc(String value) {
        return new JAXBElement<String>(_CRALoc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CRAIncomeLvl")
    public JAXBElement<String> createCRAIncomeLvl(String value) {
        return new JAXBElement<String>(_CRAIncomeLvl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Reissue")
    public JAXBElement<String> createReissue(String value) {
        return new JAXBElement<String>(_Reissue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivationCauseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DeactivationCause")
    public JAXBElement<DeactivationCauseType> createDeactivationCause(DeactivationCauseType value) {
        return new JAXBElement<DeactivationCauseType>(_DeactivationCause_QNAME, DeactivationCauseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CardID")
    public JAXBElement<String> createCardID(String value) {
        return new JAXBElement<String>(_CardID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CardType")
    public JAXBElement<String> createCardType(String value) {
        return new JAXBElement<String>(_CardType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CardClass")
    public JAXBElement<Long> createCardClass(Long value) {
        return new JAXBElement<Long>(_CardClass_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CardBaseID")
    public JAXBElement<String> createCardBaseID(String value) {
        return new JAXBElement<String>(_CardBaseID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CardProduct")
    public JAXBElement<String> createCardProduct(String value) {
        return new JAXBElement<String>(_CardProduct_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CardHolderID")
    public JAXBElement<String> createCardHolderID(String value) {
        return new JAXBElement<String>(_CardHolderID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CardHolderName")
    public JAXBElement<String> createCardHolderName(String value) {
        return new JAXBElement<String>(_CardHolderName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CardExpirationDate")
    public JAXBElement<String> createCardExpirationDate(String value) {
        return new JAXBElement<String>(_CardExpirationDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CardStatus")
    public JAXBElement<CardStatusType> createCardStatus(CardStatusType value) {
        return new JAXBElement<CardStatusType>(_CardStatus_QNAME, CardStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CustTaxID")
    public JAXBElement<String> createCustTaxID(String value) {
        return new JAXBElement<String>(_CustTaxID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecordCount")
    public JAXBElement<Long> createRecordCount(Long value) {
        return new JAXBElement<Long>(_RecordCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepositOnly")
    public JAXBElement<Boolean> createDepositOnly(Boolean value) {
        return new JAXBElement<Boolean>(_DepositOnly_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BankAcctFeatType")
    public JAXBElement<String> createBankAcctFeatType(String value) {
        return new JAXBElement<String>(_BankAcctFeatType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FeatureEnabled")
    public JAXBElement<Boolean> createFeatureEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_FeatureEnabled_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelRangeDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SelRangeDt")
    public JAXBElement<SelRangeDtType> createSelRangeDt(SelRangeDtType value) {
        return new JAXBElement<SelRangeDtType>(_SelRangeDt_QNAME, SelRangeDtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ChkNumStart")
    public JAXBElement<String> createChkNumStart(String value) {
        return new JAXBElement<String>(_ChkNumStart_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ChkNumEnd")
    public JAXBElement<String> createChkNumEnd(String value) {
        return new JAXBElement<String>(_ChkNumEnd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TrnType")
    public JAXBElement<String> createTrnType(String value) {
        return new JAXBElement<String>(_TrnType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepositAmt")
    public JAXBElement<CurrencyAmount> createDepositAmt(CurrencyAmount value) {
        return new JAXBElement<CurrencyAmount>(_DepositAmt_QNAME, CurrencyAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DebitAcct")
    public JAXBElement<AccountsType> createDebitAcct(AccountsType value) {
        return new JAXBElement<AccountsType>(_DebitAcct_QNAME, AccountsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PostedDt")
    public JAXBElement<XMLGregorianCalendar> createPostedDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PostedDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IndustNum")
    public JAXBElement<String> createIndustNum(String value) {
        return new JAXBElement<String>(_IndustNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Memo")
    public JAXBElement<String> createMemo(String value) {
        return new JAXBElement<String>(_Memo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FITID")
    public JAXBElement<String> createFITID(String value) {
        return new JAXBElement<String>(_FITID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ChkNum")
    public JAXBElement<String> createChkNum(String value) {
        return new JAXBElement<String>(_ChkNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CardNumber")
    public JAXBElement<String> createCardNumber(String value) {
        return new JAXBElement<String>(_CardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "LoanTranBrkoutType")
    public JAXBElement<String> createLoanTranBrkoutType(String value) {
        return new JAXBElement<String>(_LoanTranBrkoutType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "UniqueImageId")
    public JAXBElement<String> createUniqueImageId(String value) {
        return new JAXBElement<String>(_UniqueImageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SideOfImage")
    public JAXBElement<String> createSideOfImage(String value) {
        return new JAXBElement<String>(_SideOfImage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Image")
    public JAXBElement<ImageType> createImage(ImageType value) {
        return new JAXBElement<ImageType>(_Image_QNAME, ImageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillId")
    public JAXBElement<String> createBillId(String value) {
        return new JAXBElement<String>(_BillId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillerNum")
    public JAXBElement<String> createBillerNum(String value) {
        return new JAXBElement<String>(_BillerNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillType")
    public JAXBElement<String> createBillType(String value) {
        return new JAXBElement<String>(_BillType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillStatusCode")
    public JAXBElement<String> createBillStatusCode(String value) {
        return new JAXBElement<String>(_BillStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillPmtStatusCode")
    public JAXBElement<String> createBillPmtStatusCode(String value) {
        return new JAXBElement<String>(_BillPmtStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NotifyWilling")
    public JAXBElement<Boolean> createNotifyWilling(Boolean value) {
        return new JAXBElement<Boolean>(_NotifyWilling_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IncCounts")
    public JAXBElement<Boolean> createIncCounts(Boolean value) {
        return new JAXBElement<Boolean>(_IncCounts_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IncSummary")
    public JAXBElement<Boolean> createIncSummary(Boolean value) {
        return new JAXBElement<Boolean>(_IncSummary_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DeliveryMethod")
    public JAXBElement<String> createDeliveryMethod(String value) {
        return new JAXBElement<String>(_DeliveryMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillCountsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillCounts")
    public JAXBElement<BillCountsType> createBillCounts(BillCountsType value) {
        return new JAXBElement<BillCountsType>(_BillCounts_QNAME, BillCountsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillRec")
    public JAXBElement<BillRecType> createBillRec(BillRecType value) {
        return new JAXBElement<BillRecType>(_BillRec_QNAME, BillRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Phone")
    public JAXBElement<String> createPhone(String value) {
        return new JAXBElement<String>(_Phone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IncBillerContact")
    public JAXBElement<Boolean> createIncBillerContact(Boolean value) {
        return new JAXBElement<Boolean>(_IncBillerContact_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IncImages")
    public JAXBElement<Boolean> createIncImages(Boolean value) {
        return new JAXBElement<Boolean>(_IncImages_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NewUpDt")
    public JAXBElement<XMLGregorianCalendar> createNewUpDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NewUpDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillerRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillerRec")
    public JAXBElement<BillerRecType> createBillerRec(BillerRecType value) {
        return new JAXBElement<BillerRecType>(_BillerRec_QNAME, BillerRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "URL")
    public JAXBElement<String> createURL(String value) {
        return new JAXBElement<String>(_URL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MostRecent")
    public JAXBElement<Boolean> createMostRecent(Boolean value) {
        return new JAXBElement<Boolean>(_MostRecent_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "All")
    public JAXBElement<Boolean> createAll(Boolean value) {
        return new JAXBElement<Boolean>(_All_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StmtType")
    public JAXBElement<String> createStmtType(String value) {
        return new JAXBElement<String>(_StmtType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerialRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SerialRange")
    public JAXBElement<SerialRangeType> createSerialRange(SerialRangeType value) {
        return new JAXBElement<SerialRangeType>(_SerialRange_QNAME, SerialRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CheckStatus")
    public JAXBElement<String> createCheckStatus(String value) {
        return new JAXBElement<String>(_CheckStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CheckBookId")
    public JAXBElement<String> createCheckBookId(String value) {
        return new JAXBElement<String>(_CheckBookId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CreditAuthType")
    public JAXBElement<String> createCreditAuthType(String value) {
        return new JAXBElement<String>(_CreditAuthType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CompCurAmtId")
    public JAXBElement<String> createCompCurAmtId(String value) {
        return new JAXBElement<String>(_CompCurAmtId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CompCurAmtType")
    public JAXBElement<String> createCompCurAmtType(String value) {
        return new JAXBElement<String>(_CompCurAmtType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SpecialHandling")
    public JAXBElement<String> createSpecialHandling(String value) {
        return new JAXBElement<String>(_SpecialHandling_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CreditAuthId")
    public JAXBElement<String> createCreditAuthId(String value) {
        return new JAXBElement<String>(_CreditAuthId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CreditStatusCode")
    public JAXBElement<String> createCreditStatusCode(String value) {
        return new JAXBElement<String>(_CreditStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StatusModBy")
    public JAXBElement<String> createStatusModBy(String value) {
        return new JAXBElement<String>(_StatusModBy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SecretId")
    public JAXBElement<String> createSecretId(String value) {
        return new JAXBElement<String>(_SecretId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Secret")
    public JAXBElement<String> createSecret(String value) {
        return new JAXBElement<String>(_Secret_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TaxId")
    public JAXBElement<String> createTaxId(String value) {
        return new JAXBElement<String>(_TaxId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CompanyID")
    public JAXBElement<String> createCompanyID(String value) {
        return new JAXBElement<String>(_CompanyID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "LastName")
    public JAXBElement<String> createLastName(String value) {
        return new JAXBElement<String>(_LastName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FirstName")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MiddleName")
    public JAXBElement<String> createMiddleName(String value) {
        return new JAXBElement<String>(_MiddleName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TitlePrefix")
    public JAXBElement<String> createTitlePrefix(String value) {
        return new JAXBElement<String>(_TitlePrefix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NameSuffix")
    public JAXBElement<String> createNameSuffix(String value) {
        return new JAXBElement<String>(_NameSuffix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DayPhone")
    public JAXBElement<String> createDayPhone(String value) {
        return new JAXBElement<String>(_DayPhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "EvePhone")
    public JAXBElement<String> createEvePhone(String value) {
        return new JAXBElement<String>(_EvePhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DayFax")
    public JAXBElement<String> createDayFax(String value) {
        return new JAXBElement<String>(_DayFax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "EmailAddr")
    public JAXBElement<String> createEmailAddr(String value) {
        return new JAXBElement<String>(_EmailAddr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CustType")
    public JAXBElement<String> createCustType(String value) {
        return new JAXBElement<String>(_CustType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CompanyName")
    public JAXBElement<String> createCompanyName(String value) {
        return new JAXBElement<String>(_CompanyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ParentCompanyName")
    public JAXBElement<String> createParentCompanyName(String value) {
        return new JAXBElement<String>(_ParentCompanyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BirthDt")
    public JAXBElement<XMLGregorianCalendar> createBirthDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BirthDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IdentificationInfo")
    public JAXBElement<IdentificationInfoType> createIdentificationInfo(IdentificationInfoType value) {
        return new JAXBElement<IdentificationInfoType>(_IdentificationInfo_QNAME, IdentificationInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmploymentHistoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "EmploymentHistory")
    public JAXBElement<EmploymentHistoryType> createEmploymentHistory(EmploymentHistoryType value) {
        return new JAXBElement<EmploymentHistoryType>(_EmploymentHistory_QNAME, EmploymentHistoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "LegalName")
    public JAXBElement<String> createLegalName(String value) {
        return new JAXBElement<String>(_LegalName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ContactInfoType")
    public JAXBElement<String> createContactInfoType(String value) {
        return new JAXBElement<String>(_ContactInfoType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ContactPref")
    public JAXBElement<String> createContactPref(String value) {
        return new JAXBElement<String>(_ContactPref_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PrefTimeStart")
    public JAXBElement<XMLGregorianCalendar> createPrefTimeStart(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrefTimeStart_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PrefTimeEnd")
    public JAXBElement<XMLGregorianCalendar> createPrefTimeEnd(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrefTimeEnd_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PhoneType")
    public JAXBElement<String> createPhoneType(String value) {
        return new JAXBElement<String>(_PhoneType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MerchantId")
    public JAXBElement<String> createMerchantId(String value) {
        return new JAXBElement<String>(_MerchantId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MerchantName")
    public JAXBElement<String> createMerchantName(String value) {
        return new JAXBElement<String>(_MerchantName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "globalMerchant")
    public JAXBElement<Boolean> createGlobalMerchant(Boolean value) {
        return new JAXBElement<Boolean>(_GlobalMerchant_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ContactType")
    public JAXBElement<String> createContactType(String value) {
        return new JAXBElement<String>(_ContactType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Fax")
    public JAXBElement<String> createFax(String value) {
        return new JAXBElement<String>(_Fax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OrgIdType")
    public JAXBElement<String> createOrgIdType(String value) {
        return new JAXBElement<String>(_OrgIdType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OrgIdNum")
    public JAXBElement<String> createOrgIdNum(String value) {
        return new JAXBElement<String>(_OrgIdNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RemitName")
    public JAXBElement<String> createRemitName(String value) {
        return new JAXBElement<String>(_RemitName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "HistRetentionDays")
    public JAXBElement<Long> createHistRetentionDays(Long value) {
        return new JAXBElement<Long>(_HistRetentionDays_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PmtInstType")
    public JAXBElement<String> createPmtInstType(String value) {
        return new JAXBElement<String>(_PmtInstType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Brand")
    public JAXBElement<String> createBrand(String value) {
        return new JAXBElement<String>(_Brand_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SettlementMethod")
    public JAXBElement<String> createSettlementMethod(String value) {
        return new JAXBElement<String>(_SettlementMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SettlementId")
    public JAXBElement<String> createSettlementId(String value) {
        return new JAXBElement<String>(_SettlementId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PmtFormat")
    public JAXBElement<String> createPmtFormat(String value) {
        return new JAXBElement<String>(_PmtFormat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SeqNum")
    public JAXBElement<Long> createSeqNum(Long value) {
        return new JAXBElement<Long>(_SeqNum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ChargeRegulation")
    public JAXBElement<String> createChargeRegulation(String value) {
        return new JAXBElement<String>(_ChargeRegulation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FeeType")
    public JAXBElement<String> createFeeType(String value) {
        return new JAXBElement<String>(_FeeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SpecInstruction")
    public JAXBElement<String> createSpecInstruction(String value) {
        return new JAXBElement<String>(_SpecInstruction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DaysToEPost")
    public JAXBElement<Long> createDaysToEPost(Long value) {
        return new JAXBElement<Long>(_DaysToEPost_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PrenoteReqd")
    public JAXBElement<Boolean> createPrenoteReqd(Boolean value) {
        return new JAXBElement<Boolean>(_PrenoteReqd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillingAcct")
    public JAXBElement<String> createBillingAcct(String value) {
        return new JAXBElement<String>(_BillingAcct_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctPayAcctId")
    public JAXBElement<String> createAcctPayAcctId(String value) {
        return new JAXBElement<String>(_AcctPayAcctId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Category")
    public JAXBElement<String> createCategory(String value) {
        return new JAXBElement<String>(_Category_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CustPayeeId")
    public JAXBElement<String> createCustPayeeId(String value) {
        return new JAXBElement<String>(_CustPayeeId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CutOffTime")
    public JAXBElement<XMLGregorianCalendar> createCutOffTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CutOffTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DaysToPay")
    public JAXBElement<Long> createDaysToPay(Long value) {
        return new JAXBElement<Long>(_DaysToPay_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CSPRefId")
    public JAXBElement<String> createCSPRefId(String value) {
        return new JAXBElement<String>(_CSPRefId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SPRefId")
    public JAXBElement<String> createSPRefId(String value) {
        return new JAXBElement<String>(_SPRefId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CascadeDel")
    public JAXBElement<Boolean> createCascadeDel(Boolean value) {
        return new JAXBElement<Boolean>(_CascadeDel_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DependentType")
    public JAXBElement<String> createDependentType(String value) {
        return new JAXBElement<String>(_DependentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ModPending")
    public JAXBElement<Boolean> createModPending(Boolean value) {
        return new JAXBElement<Boolean>(_ModPending_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MaxRec")
    public JAXBElement<Long> createMaxRec(Long value) {
        return new JAXBElement<Long>(_MaxRec_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MatchedRec")
    public JAXBElement<Long> createMatchedRec(Long value) {
        return new JAXBElement<Long>(_MatchedRec_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SentRec")
    public JAXBElement<Long> createSentRec(Long value) {
        return new JAXBElement<Long>(_SentRec_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Token")
    public JAXBElement<String> createToken(String value) {
        return new JAXBElement<String>(_Token_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NewToken")
    public JAXBElement<String> createNewToken(String value) {
        return new JAXBElement<String>(_NewToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MsgRecDt")
    public JAXBElement<XMLGregorianCalendar> createMsgRecDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MsgRecDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PayeeType")
    public JAXBElement<String> createPayeeType(String value) {
        return new JAXBElement<String>(_PayeeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SearchCriteria")
    public JAXBElement<SearchCriteriaType> createSearchCriteria(SearchCriteriaType value) {
        return new JAXBElement<SearchCriteriaType>(_SearchCriteria_QNAME, SearchCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DebitAuthType")
    public JAXBElement<String> createDebitAuthType(String value) {
        return new JAXBElement<String>(_DebitAuthType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DebitAuthId")
    public JAXBElement<String> createDebitAuthId(String value) {
        return new JAXBElement<String>(_DebitAuthId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DebitStatusCode")
    public JAXBElement<String> createDebitStatusCode(String value) {
        return new JAXBElement<String>(_DebitStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppAddRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepAppAddRq")
    public JAXBElement<DepAppAddRqType> createDepAppAddRq(DepAppAddRqType value) {
        return new JAXBElement<DepAppAddRqType>(_DepAppAddRq_QNAME, DepAppAddRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppAddRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepAppAddRs")
    public JAXBElement<DepAppAddRsType> createDepAppAddRs(DepAppAddRsType value) {
        return new JAXBElement<DepAppAddRsType>(_DepAppAddRs_QNAME, DepAppAddRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileStatusInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FileStatusInfo")
    public JAXBElement<FileStatusInfoType> createFileStatusInfo(FileStatusInfoType value) {
        return new JAXBElement<FileStatusInfoType>(_FileStatusInfo_QNAME, FileStatusInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileStatusInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AdditionalFileStatusInfo")
    public JAXBElement<FileStatusInfoType> createAdditionalFileStatusInfo(FileStatusInfoType value) {
        return new JAXBElement<FileStatusInfoType>(_AdditionalFileStatusInfo_QNAME, FileStatusInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FileStatusRec")
    public JAXBElement<FileStatusRecType> createFileStatusRec(FileStatusRecType value) {
        return new JAXBElement<FileStatusRecType>(_FileStatusRec_QNAME, FileStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgRqHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MsgRqHdr")
    public JAXBElement<MsgRqHdrType> createMsgRqHdr(MsgRqHdrType value) {
        return new JAXBElement<MsgRqHdrType>(_MsgRqHdr_QNAME, MsgRqHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExDealInfo")
    public JAXBElement<ForExDealInfoType> createForExDealInfo(ForExDealInfoType value) {
        return new JAXBElement<ForExDealInfoType>(_ForExDealInfo_QNAME, ForExDealInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExDealId")
    public JAXBElement<String> createForExDealId(String value) {
        return new JAXBElement<String>(_ForExDealId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExRateAction")
    public JAXBElement<String> createForExRateAction(String value) {
        return new JAXBElement<String>(_ForExRateAction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ConvCurAmt")
    public JAXBElement<CurrencyAmount> createConvCurAmt(CurrencyAmount value) {
        return new JAXBElement<CurrencyAmount>(_ConvCurAmt_QNAME, CurrencyAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CurRate")
    public JAXBElement<BigDecimal> createCurRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CurRate_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExRateType")
    public JAXBElement<String> createForExRateType(String value) {
        return new JAXBElement<String>(_ForExRateType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgRsHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MsgRsHdr")
    public JAXBElement<MsgRsHdrType> createMsgRsHdr(MsgRsHdrType value) {
        return new JAXBElement<MsgRsHdrType>(_MsgRsHdr_QNAME, MsgRsHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExDealRec")
    public JAXBElement<ForExDealRecType> createForExDealRec(ForExDealRecType value) {
        return new JAXBElement<ForExDealRecType>(_ForExDealRec_QNAME, ForExDealRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ValueDt")
    public JAXBElement<XMLGregorianCalendar> createValueDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ValueDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartnerRefId")
    public JAXBElement<String> createPartnerRefId(String value) {
        return new JAXBElement<String>(_PartnerRefId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExOffsetRateInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExOffsetRateInfo")
    public JAXBElement<ForExOffsetRateInfoType> createForExOffsetRateInfo(ForExOffsetRateInfoType value) {
        return new JAXBElement<ForExOffsetRateInfoType>(_ForExOffsetRateInfo_QNAME, ForExOffsetRateInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OffsetAmt")
    public JAXBElement<CurrencyAmount> createOffsetAmt(CurrencyAmount value) {
        return new JAXBElement<CurrencyAmount>(_OffsetAmt_QNAME, CurrencyAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExRateId")
    public JAXBElement<String> createForExRateId(String value) {
        return new JAXBElement<String>(_ForExRateId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExRateDealType")
    public JAXBElement<String> createForExRateDealType(String value) {
        return new JAXBElement<String>(_ForExRateDealType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealMsgRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExDealMsgRec")
    public JAXBElement<ForExDealMsgRecType> createForExDealMsgRec(ForExDealMsgRecType value) {
        return new JAXBElement<ForExDealMsgRecType>(_ForExDealMsgRec_QNAME, ForExDealMsgRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ToCurCode")
    public JAXBElement<String> createToCurCode(String value) {
        return new JAXBElement<String>(_ToCurCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FromCurCode")
    public JAXBElement<String> createFromCurCode(String value) {
        return new JAXBElement<String>(_FromCurCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExValDtType")
    public JAXBElement<String> createForExValDtType(String value) {
        return new JAXBElement<String>(_ForExValDtType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CurConvertRule")
    public JAXBElement<String> createCurConvertRule(String value) {
        return new JAXBElement<String>(_CurConvertRule_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "QuotedDt")
    public JAXBElement<XMLGregorianCalendar> createQuotedDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuotedDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TranDt")
    public JAXBElement<XMLGregorianCalendar> createTranDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TranDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExValDt")
    public JAXBElement<XMLGregorianCalendar> createForExValDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForExValDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StartDt")
    public JAXBElement<XMLGregorianCalendar> createStartDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "EndDt")
    public JAXBElement<XMLGregorianCalendar> createEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurCodeRatesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CurCodeRates")
    public JAXBElement<CurCodeRatesType> createCurCodeRates(CurCodeRatesType value) {
        return new JAXBElement<CurCodeRatesType>(_CurCodeRates_QNAME, CurCodeRatesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenAppAddRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenAppAddRq")
    public JAXBElement<GenAppAddRqType> createGenAppAddRq(GenAppAddRqType value) {
        return new JAXBElement<GenAppAddRqType>(_GenAppAddRq_QNAME, GenAppAddRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenAppAddRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenAppAddRs")
    public JAXBElement<GenAppAddRsType> createGenAppAddRs(GenAppAddRsType value) {
        return new JAXBElement<GenAppAddRsType>(_GenAppAddRs_QNAME, GenAppAddRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenAppCanRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenAppCanRq")
    public JAXBElement<GenAppCanRqType> createGenAppCanRq(GenAppCanRqType value) {
        return new JAXBElement<GenAppCanRqType>(_GenAppCanRq_QNAME, GenAppCanRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenAppCanRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenAppCanRs")
    public JAXBElement<GenAppCanRsType> createGenAppCanRs(GenAppCanRsType value) {
        return new JAXBElement<GenAppCanRsType>(_GenAppCanRs_QNAME, GenAppCanRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HostCustAddRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "HostCustAddRq")
    public JAXBElement<HostCustAddRqType> createHostCustAddRq(HostCustAddRqType value) {
        return new JAXBElement<HostCustAddRqType>(_HostCustAddRq_QNAME, HostCustAddRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HostCustAddRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "HostCustAddRs")
    public JAXBElement<HostCustAddRsType> createHostCustAddRs(HostCustAddRsType value) {
        return new JAXBElement<HostCustAddRsType>(_HostCustAddRs_QNAME, HostCustAddRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "InterfaceVersion", defaultValue = "3.7.0.0.20")
    public JAXBElement<String> createInterfaceVersion(String value) {
        return new JAXBElement<String>(_InterfaceVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NoteRange")
    public JAXBElement<NoteRangeType> createNoteRange(NoteRangeType value) {
        return new JAXBElement<NoteRangeType>(_NoteRange_QNAME, NoteRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CommitmentNumber")
    public JAXBElement<String> createCommitmentNumber(String value) {
        return new JAXBElement<String>(_CommitmentNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NextRateChangeDate")
    public JAXBElement<XMLGregorianCalendar> createNextRateChangeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NextRateChangeDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DtRange")
    public JAXBElement<DtRangeType> createDtRange(DtRangeType value) {
        return new JAXBElement<DtRangeType>(_DtRange_QNAME, DtRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelAddRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelAddRq")
    public JAXBElement<PartyAcctRelAddRqType> createPartyAcctRelAddRq(PartyAcctRelAddRqType value) {
        return new JAXBElement<PartyAcctRelAddRqType>(_PartyAcctRelAddRq_QNAME, PartyAcctRelAddRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelAddRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelAddRs")
    public JAXBElement<PartyAcctRelAddRsType> createPartyAcctRelAddRs(PartyAcctRelAddRsType value) {
        return new JAXBElement<PartyAcctRelAddRsType>(_PartyAcctRelAddRs_QNAME, PartyAcctRelAddRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelDelRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelDelRq")
    public JAXBElement<PartyAcctRelDelRqType> createPartyAcctRelDelRq(PartyAcctRelDelRqType value) {
        return new JAXBElement<PartyAcctRelDelRqType>(_PartyAcctRelDelRq_QNAME, PartyAcctRelDelRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelDelRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelDelRs")
    public JAXBElement<PartyAcctRelDelRsType> createPartyAcctRelDelRs(PartyAcctRelDelRsType value) {
        return new JAXBElement<PartyAcctRelDelRsType>(_PartyAcctRelDelRs_QNAME, PartyAcctRelDelRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelInqRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelInqRq")
    public JAXBElement<PartyAcctRelInqRqType> createPartyAcctRelInqRq(PartyAcctRelInqRqType value) {
        return new JAXBElement<PartyAcctRelInqRqType>(_PartyAcctRelInqRq_QNAME, PartyAcctRelInqRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelInqRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelInqRs")
    public JAXBElement<PartyAcctRelInqRsType> createPartyAcctRelInqRs(PartyAcctRelInqRsType value) {
        return new JAXBElement<PartyAcctRelInqRsType>(_PartyAcctRelInqRs_QNAME, PartyAcctRelInqRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelModRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelModRq")
    public JAXBElement<PartyAcctRelModRqType> createPartyAcctRelModRq(PartyAcctRelModRqType value) {
        return new JAXBElement<PartyAcctRelModRqType>(_PartyAcctRelModRq_QNAME, PartyAcctRelModRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelModRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelModRs")
    public JAXBElement<PartyAcctRelModRsType> createPartyAcctRelModRs(PartyAcctRelModRsType value) {
        return new JAXBElement<PartyAcctRelModRsType>(_PartyAcctRelModRs_QNAME, PartyAcctRelModRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PayerInfo")
    public JAXBElement<PayerInfoType> createPayerInfo(PayerInfoType value) {
        return new JAXBElement<PayerInfoType>(_PayerInfo_QNAME, PayerInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RemitRefId")
    public JAXBElement<String> createRemitRefId(String value) {
        return new JAXBElement<String>(_RemitRefId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PmtRefId")
    public JAXBElement<String> createPmtRefId(String value) {
        return new JAXBElement<String>(_PmtRefId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DeliveryInstruction")
    public JAXBElement<String> createDeliveryInstruction(String value) {
        return new JAXBElement<String>(_DeliveryInstruction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OrgPhone")
    public JAXBElement<String> createOrgPhone(String value) {
        return new JAXBElement<String>(_OrgPhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillRefInfo")
    public JAXBElement<String> createBillRefInfo(String value) {
        return new JAXBElement<String>(_BillRefInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PmtId")
    public JAXBElement<String> createPmtId(String value) {
        return new JAXBElement<String>(_PmtId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillSummAmtId")
    public JAXBElement<String> createBillSummAmtId(String value) {
        return new JAXBElement<String>(_BillSummAmtId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "InvoiceType")
    public JAXBElement<String> createInvoiceType(String value) {
        return new JAXBElement<String>(_InvoiceType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "InvoiceNum")
    public JAXBElement<String> createInvoiceNum(String value) {
        return new JAXBElement<String>(_InvoiceNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "InvoiceVouchNum")
    public JAXBElement<String> createInvoiceVouchNum(String value) {
        return new JAXBElement<String>(_InvoiceVouchNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TaxType")
    public JAXBElement<String> createTaxType(String value) {
        return new JAXBElement<String>(_TaxType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "InvoiceAdjNum")
    public JAXBElement<String> createInvoiceAdjNum(String value) {
        return new JAXBElement<String>(_InvoiceAdjNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AdjType")
    public JAXBElement<String> createAdjType(String value) {
        return new JAXBElement<String>(_AdjType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "InvoiceLineItemNum")
    public JAXBElement<String> createInvoiceLineItemNum(String value) {
        return new JAXBElement<String>(_InvoiceLineItemNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctPayAcct")
    public JAXBElement<String> createAcctPayAcct(String value) {
        return new JAXBElement<String>(_AcctPayAcct_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PayeeCountry")
    public JAXBElement<String> createPayeeCountry(String value) {
        return new JAXBElement<String>(_PayeeCountry_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PrcDt")
    public JAXBElement<XMLGregorianCalendar> createPrcDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrcDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "LegalRptCode")
    public JAXBElement<String> createLegalRptCode(String value) {
        return new JAXBElement<String>(_LegalRptCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SupplRptCode")
    public JAXBElement<String> createSupplRptCode(String value) {
        return new JAXBElement<String>(_SupplRptCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SupplyingCountry")
    public JAXBElement<String> createSupplyingCountry(String value) {
        return new JAXBElement<String>(_SupplyingCountry_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ImportDt")
    public JAXBElement<XMLGregorianCalendar> createImportDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ImportDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ImmediatePmt")
    public JAXBElement<Boolean> createImmediatePmt(Boolean value) {
        return new JAXBElement<Boolean>(_ImmediatePmt_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemittanceInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RemittanceInfo")
    public JAXBElement<RemittanceInfoType> createRemittanceInfo(RemittanceInfoType value) {
        return new JAXBElement<RemittanceInfoType>(_RemittanceInfo_QNAME, RemittanceInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DupChkOverride")
    public JAXBElement<Boolean> createDupChkOverride(Boolean value) {
        return new JAXBElement<Boolean>(_DupChkOverride_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecPmtId")
    public JAXBElement<String> createRecPmtId(String value) {
        return new JAXBElement<String>(_RecPmtId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PmtStatusCode")
    public JAXBElement<String> createPmtStatusCode(String value) {
        return new JAXBElement<String>(_PmtStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PmtAuthId")
    public JAXBElement<String> createPmtAuthId(String value) {
        return new JAXBElement<String>(_PmtAuthId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RemitId")
    public JAXBElement<String> createRemitId(String value) {
        return new JAXBElement<String>(_RemitId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecPmtMod")
    public JAXBElement<Boolean> createRecPmtMod(Boolean value) {
        return new JAXBElement<Boolean>(_RecPmtMod_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PmtAuthCount")
    public JAXBElement<Long> createPmtAuthCount(Long value) {
        return new JAXBElement<Long>(_PmtAuthCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PmtMethod")
    public JAXBElement<String> createPmtMethod(String value) {
        return new JAXBElement<String>(_PmtMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CreatedDt")
    public JAXBElement<XMLGregorianCalendar> createCreatedDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreatedDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OrigPmtPrcDt")
    public JAXBElement<XMLGregorianCalendar> createOrigPmtPrcDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrigPmtPrcDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OrigPmtDueDt")
    public JAXBElement<XMLGregorianCalendar> createOrigPmtDueDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrigPmtDueDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FIDebitTrcNum")
    public JAXBElement<String> createFIDebitTrcNum(String value) {
        return new JAXBElement<String>(_FIDebitTrcNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FICreditTrcNum")
    public JAXBElement<String> createFICreditTrcNum(String value) {
        return new JAXBElement<String>(_FICreditTrcNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtInqRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PmtInqRq")
    public JAXBElement<PmtInqRqType> createPmtInqRq(PmtInqRqType value) {
        return new JAXBElement<PmtInqRqType>(_PmtInqRq_QNAME, PmtInqRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtInqRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PmtInqRs")
    public JAXBElement<PmtInqRsType> createPmtInqRs(PmtInqRsType value) {
        return new JAXBElement<PmtInqRsType>(_PmtInqRs_QNAME, PmtInqRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "UpPayee")
    public JAXBElement<Boolean> createUpPayee(Boolean value) {
        return new JAXBElement<Boolean>(_UpPayee_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkTrnInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NetworkTrnInfo")
    public JAXBElement<NetworkTrnInfoType> createNetworkTrnInfo(NetworkTrnInfoType value) {
        return new JAXBElement<NetworkTrnInfoType>(_NetworkTrnInfo_QNAME, NetworkTrnInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Freq")
    public JAXBElement<String> createFreq(String value) {
        return new JAXBElement<String>(_Freq_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NumInsts")
    public JAXBElement<Long> createNumInsts(Long value) {
        return new JAXBElement<Long>(_NumInsts_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FinalPrcDt")
    public JAXBElement<XMLGregorianCalendar> createFinalPrcDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FinalPrcDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FinalDueDt")
    public JAXBElement<XMLGregorianCalendar> createFinalDueDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FinalDueDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NextPmtDt")
    public JAXBElement<XMLGregorianCalendar> createNextPmtDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NextPmtDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SkipNextN")
    public JAXBElement<Long> createSkipNextN(Long value) {
        return new JAXBElement<Long>(_SkipNextN_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RemainingInsts")
    public JAXBElement<Long> createRemainingInsts(Long value) {
        return new JAXBElement<Long>(_RemainingInsts_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecPmtInqRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecPmtInqRq")
    public JAXBElement<RecPmtInqRqType> createRecPmtInqRq(RecPmtInqRqType value) {
        return new JAXBElement<RecPmtInqRqType>(_RecPmtInqRq_QNAME, RecPmtInqRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecPmtInqRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecPmtInqRs")
    public JAXBElement<RecPmtInqRsType> createRecPmtInqRs(RecPmtInqRsType value) {
        return new JAXBElement<RecPmtInqRsType>(_RecPmtInqRs_QNAME, RecPmtInqRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferAddRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecXferAddRq")
    public JAXBElement<RecXferAddRqType> createRecXferAddRq(RecXferAddRqType value) {
        return new JAXBElement<RecXferAddRqType>(_RecXferAddRq_QNAME, RecXferAddRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferAddRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecXferAddRs")
    public JAXBElement<RecXferAddRsType> createRecXferAddRs(RecXferAddRsType value) {
        return new JAXBElement<RecXferAddRsType>(_RecXferAddRs_QNAME, RecXferAddRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferCanRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecXferCanRq")
    public JAXBElement<RecXferCanRqType> createRecXferCanRq(RecXferCanRqType value) {
        return new JAXBElement<RecXferCanRqType>(_RecXferCanRq_QNAME, RecXferCanRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferCanRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecXferCanRs")
    public JAXBElement<RecXferCanRsType> createRecXferCanRs(RecXferCanRsType value) {
        return new JAXBElement<RecXferCanRsType>(_RecXferCanRs_QNAME, RecXferCanRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferInqRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecXferInqRq")
    public JAXBElement<RecXferInqRqType> createRecXferInqRq(RecXferInqRqType value) {
        return new JAXBElement<RecXferInqRqType>(_RecXferInqRq_QNAME, RecXferInqRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferInqRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecXferInqRs")
    public JAXBElement<RecXferInqRsType> createRecXferInqRs(RecXferInqRsType value) {
        return new JAXBElement<RecXferInqRsType>(_RecXferInqRs_QNAME, RecXferInqRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferModRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecXferModRq")
    public JAXBElement<RecXferModRqType> createRecXferModRq(RecXferModRqType value) {
        return new JAXBElement<RecXferModRqType>(_RecXferModRq_QNAME, RecXferModRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferModRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecXferModRs")
    public JAXBElement<RecXferModRsType> createRecXferModRs(RecXferModRsType value) {
        return new JAXBElement<RecXferModRsType>(_RecXferModRs_QNAME, RecXferModRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctMask")
    public JAXBElement<String> createAcctMask(String value) {
        return new JAXBElement<String>(_AcctMask_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MailDelivery")
    public JAXBElement<String> createMailDelivery(String value) {
        return new JAXBElement<String>(_MailDelivery_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MailDeliveryStatus")
    public JAXBElement<String> createMailDeliveryStatus(String value) {
        return new JAXBElement<String>(_MailDeliveryStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Comment")
    public JAXBElement<String> createComment(String value) {
        return new JAXBElement<String>(_Comment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StopChkStatusCode")
    public JAXBElement<String> createStopChkStatusCode(String value) {
        return new JAXBElement<String>(_StopChkStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifiedAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "QualifiedAmt")
    public JAXBElement<QualifiedAmtType> createQualifiedAmt(QualifiedAmtType value) {
        return new JAXBElement<QualifiedAmtType>(_QualifiedAmt_QNAME, QualifiedAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPayInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StopPayInfo")
    public JAXBElement<StopPayInfoType> createStopPayInfo(StopPayInfoType value) {
        return new JAXBElement<StopPayInfoType>(_StopPayInfo_QNAME, StopPayInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ACHCompanyId")
    public JAXBElement<String> createACHCompanyId(String value) {
        return new JAXBElement<String>(_ACHCompanyId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ACHStdEntryClass")
    public JAXBElement<String> createACHStdEntryClass(String value) {
        return new JAXBElement<String>(_ACHStdEntryClass_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ACHDrCRAll")
    public JAXBElement<String> createACHDrCRAll(String value) {
        return new JAXBElement<String>(_ACHDrCRAll_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPayRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StopPayRec")
    public JAXBElement<StopPayRecType> createStopPayRec(StopPayRecType value) {
        return new JAXBElement<StopPayRecType>(_StopPayRec_QNAME, StopPayRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StopPayUID")
    public JAXBElement<String> createStopPayUID(String value) {
        return new JAXBElement<String>(_StopPayUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StopPayStatusCode")
    public JAXBElement<String> createStopPayStatusCode(String value) {
        return new JAXBElement<String>(_StopPayStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IncAccts")
    public JAXBElement<AccountsType> createIncAccts(AccountsType value) {
        return new JAXBElement<AccountsType>(_IncAccts_QNAME, AccountsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IncDetail")
    public JAXBElement<Boolean> createIncDetail(Boolean value) {
        return new JAXBElement<Boolean>(_IncDetail_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IncAdditDetail")
    public JAXBElement<Boolean> createIncAdditDetail(Boolean value) {
        return new JAXBElement<Boolean>(_IncAdditDetail_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "XferDetail")
    public JAXBElement<XferDetailType> createXferDetail(XferDetailType value) {
        return new JAXBElement<XferDetailType>(_XferDetail_QNAME, XferDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "XferId")
    public JAXBElement<String> createXferId(String value) {
        return new JAXBElement<String>(_XferId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "XferStatusCode")
    public JAXBElement<String> createXferStatusCode(String value) {
        return new JAXBElement<String>(_XferStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferCanRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "XferCanRq")
    public JAXBElement<XferCanRqType> createXferCanRq(XferCanRqType value) {
        return new JAXBElement<XferCanRqType>(_XferCanRq_QNAME, XferCanRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferCanRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "XferCanRs")
    public JAXBElement<XferCanRsType> createXferCanRs(XferCanRsType value) {
        return new JAXBElement<XferCanRsType>(_XferCanRs_QNAME, XferCanRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferInqRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "XferInqRq")
    public JAXBElement<XferInqRqType> createXferInqRq(XferInqRqType value) {
        return new JAXBElement<XferInqRqType>(_XferInqRq_QNAME, XferInqRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferInqRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "XferInqRs")
    public JAXBElement<XferInqRsType> createXferInqRs(XferInqRsType value) {
        return new JAXBElement<XferInqRsType>(_XferInqRs_QNAME, XferInqRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferModRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "XferModRq")
    public JAXBElement<XferModRqType> createXferModRq(XferModRqType value) {
        return new JAXBElement<XferModRqType>(_XferModRq_QNAME, XferModRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferModRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "XferModRs")
    public JAXBElement<XferModRsType> createXferModRs(XferModRsType value) {
        return new JAXBElement<XferModRsType>(_XferModRs_QNAME, XferModRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ChkClrDt")
    public JAXBElement<XMLGregorianCalendar> createChkClrDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ChkClrDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IncHistory")
    public JAXBElement<Boolean> createIncHistory(Boolean value) {
        return new JAXBElement<Boolean>(_IncHistory_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IncToken")
    public JAXBElement<Boolean> createIncToken(Boolean value) {
        return new JAXBElement<Boolean>(_IncToken_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PmtType")
    public JAXBElement<String> createPmtType(String value) {
        return new JAXBElement<String>(_PmtType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecXferId")
    public JAXBElement<String> createRecXferId(String value) {
        return new JAXBElement<String>(_RecXferId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecXferRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RecXferRec")
    public JAXBElement<RecXferRecType> createRecXferRec(RecXferRecType value) {
        return new JAXBElement<RecXferRecType>(_RecXferRec_QNAME, RecXferRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelRangeDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SelRangeDueDt")
    public JAXBElement<SelRangeDtType> createSelRangeDueDt(SelRangeDtType value) {
        return new JAXBElement<SelRangeDtType>(_SelRangeDueDt_QNAME, SelRangeDtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelRangeDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SelRangePrcDt")
    public JAXBElement<SelRangeDtType> createSelRangePrcDt(SelRangeDtType value) {
        return new JAXBElement<SelRangeDtType>(_SelRangePrcDt_QNAME, SelRangeDtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ImageType")
    public JAXBElement<String> createImageType(String value) {
        return new JAXBElement<String>(_ImageType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OriginatingChannel")
    public JAXBElement<String> createOriginatingChannel(String value) {
        return new JAXBElement<String>(_OriginatingChannel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OriginatingApplication")
    public JAXBElement<String> createOriginatingApplication(String value) {
        return new JAXBElement<String>(_OriginatingApplication_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AgentType")
    public JAXBElement<String> createAgentType(String value) {
        return new JAXBElement<String>(_AgentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AgentId")
    public JAXBElement<String> createAgentId(String value) {
        return new JAXBElement<String>(_AgentId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AppICProf")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createAppICProf(byte[] value) {
        return new JAXBElement<byte[]>(_AppICProf_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AppID")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createAppID(byte[] value) {
        return new JAXBElement<byte[]>(_AppID_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AppPAN")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createAppPAN(byte[] value) {
        return new JAXBElement<byte[]>(_AppPAN_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AppPANSeq")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createAppPANSeq(byte[] value) {
        return new JAXBElement<byte[]>(_AppPANSeq_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AppTrnCounter")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createAppTrnCounter(byte[] value) {
        return new JAXBElement<byte[]>(_AppTrnCounter_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AppVersionNum")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createAppVersionNum(byte[] value) {
        return new JAXBElement<byte[]>(_AppVersionNum_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AuthAmt")
    public JAXBElement<CurrencyAmount> createAuthAmt(CurrencyAmount value) {
        return new JAXBElement<CurrencyAmount>(_AuthAmt_QNAME, CurrencyAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AuthRqCrypto")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createAuthRqCrypto(byte[] value) {
        return new JAXBElement<byte[]>(_AuthRqCrypto_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AuthRsCode")
    public JAXBElement<String> createAuthRsCode(String value) {
        return new JAXBElement<String>(_AuthRsCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CertCode")
    public JAXBElement<String> createCertCode(String value) {
        return new JAXBElement<String>(_CertCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Criteria")
    public JAXBElement<String> createCriteria(String value) {
        return new JAXBElement<String>(_Criteria_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriteriaDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CriteriaDetails")
    public JAXBElement<CriteriaDetailsType> createCriteriaDetails(CriteriaDetailsType value) {
        return new JAXBElement<CriteriaDetailsType>(_CriteriaDetails_QNAME, CriteriaDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CryptoInfoData")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createCryptoInfoData(byte[] value) {
        return new JAXBElement<byte[]>(_CryptoInfoData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CVMRslts")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createCVMRslts(byte[] value) {
        return new JAXBElement<byte[]>(_CVMRslts_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMVRqDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "EMVRqData")
    public JAXBElement<EMVRqDataType> createEMVRqData(EMVRqDataType value) {
        return new JAXBElement<EMVRqDataType>(_EMVRqData_QNAME, EMVRqDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMVRsDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "EMVRsData")
    public JAXBElement<EMVRsDataType> createEMVRsData(EMVRsDataType value) {
        return new JAXBElement<EMVRsDataType>(_EMVRsData_QNAME, EMVRsDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "EMVTrnType")
    public JAXBElement<String> createEMVTrnType(String value) {
        return new JAXBElement<String>(_EMVTrnType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Environment")
    public JAXBElement<String> createEnvironment(String value) {
        return new JAXBElement<String>(_Environment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FullName")
    public JAXBElement<String> createFullName(String value) {
        return new JAXBElement<String>(_FullName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenAppAcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenAppAcctId")
    public JAXBElement<GenAppAcctIdType> createGenAppAcctId(GenAppAcctIdType value) {
        return new JAXBElement<GenAppAcctIdType>(_GenAppAcctId_QNAME, GenAppAcctIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenAppId")
    public JAXBElement<String> createGenAppId(String value) {
        return new JAXBElement<String>(_GenAppId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenAppInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenAppInfo")
    public JAXBElement<GenAppInfoType> createGenAppInfo(GenAppInfoType value) {
        return new JAXBElement<GenAppInfoType>(_GenAppInfo_QNAME, GenAppInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenApplicantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenApplicant")
    public JAXBElement<GenApplicantType> createGenApplicant(GenApplicantType value) {
        return new JAXBElement<GenApplicantType>(_GenApplicant_QNAME, GenApplicantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenApplicantAcctRel")
    public JAXBElement<String> createGenApplicantAcctRel(String value) {
        return new JAXBElement<String>(_GenApplicantAcctRel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenAppRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenAppRec")
    public JAXBElement<GenAppRecType> createGenAppRec(GenAppRecType value) {
        return new JAXBElement<GenAppRecType>(_GenAppRec_QNAME, GenAppRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenAppStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenAppStatus")
    public JAXBElement<GenAppStatusType> createGenAppStatus(GenAppStatusType value) {
        return new JAXBElement<GenAppStatusType>(_GenAppStatus_QNAME, GenAppStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GenAppStatusCode")
    public JAXBElement<String> createGenAppStatusCode(String value) {
        return new JAXBElement<String>(_GenAppStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentCharacterDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IdentCharacterData")
    public JAXBElement<IdentCharacterDataType> createIdentCharacterData(IdentCharacterDataType value) {
        return new JAXBElement<IdentCharacterDataType>(_IdentCharacterData_QNAME, IdentCharacterDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IdentType")
    public JAXBElement<String> createIdentType(String value) {
        return new JAXBElement<String>(_IdentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IdentProgramId")
    public JAXBElement<String> createIdentProgramId(String value) {
        return new JAXBElement<String>(_IdentProgramId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IdentReadMethod")
    public JAXBElement<String> createIdentReadMethod(String value) {
        return new JAXBElement<String>(_IdentReadMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IdentVerifyMethod")
    public JAXBElement<String> createIdentVerifyMethod(String value) {
        return new JAXBElement<String>(_IdentVerifyMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IdentVerifyEntity")
    public JAXBElement<String> createIdentVerifyEntity(String value) {
        return new JAXBElement<String>(_IdentVerifyEntity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IdentConditions")
    public JAXBElement<String> createIdentConditions(String value) {
        return new JAXBElement<String>(_IdentConditions_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IdentVerifyResults")
    public JAXBElement<String> createIdentVerifyResults(String value) {
        return new JAXBElement<String>(_IdentVerifyResults_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IntCompMethod")
    public JAXBElement<String> createIntCompMethod(String value) {
        return new JAXBElement<String>(_IntCompMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IntDistMethod")
    public JAXBElement<String> createIntDistMethod(String value) {
        return new JAXBElement<String>(_IntDistMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IntPmtFreq")
    public JAXBElement<String> createIntPmtFreq(String value) {
        return new JAXBElement<String>(_IntPmtFreq_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IntXferDestAcct")
    public JAXBElement<String> createIntXferDestAcct(String value) {
        return new JAXBElement<String>(_IntXferDestAcct_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IssAppData")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createIssAppData(byte[] value) {
        return new JAXBElement<byte[]>(_IssAppData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IssAuthData")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createIssAuthData(byte[] value) {
        return new JAXBElement<byte[]>(_IssAuthData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssScriptDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IssScriptData")
    public JAXBElement<IssScriptDataType> createIssScriptData(IssScriptDataType value) {
        return new JAXBElement<IssScriptDataType>(_IssScriptData_QNAME, IssScriptDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssPrePostScriptDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IssPostScriptData")
    public JAXBElement<IssPrePostScriptDataType> createIssPostScriptData(IssPrePostScriptDataType value) {
        return new JAXBElement<IssPrePostScriptDataType>(_IssPostScriptData_QNAME, IssPrePostScriptDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssPrePostScriptDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IssPreScriptData")
    public JAXBElement<IssPrePostScriptDataType> createIssPreScriptData(IssPrePostScriptDataType value) {
        return new JAXBElement<IssPrePostScriptDataType>(_IssPreScriptData_QNAME, IssPrePostScriptDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IssScriptCmd")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createIssScriptCmd(byte[] value) {
        return new JAXBElement<byte[]>(_IssScriptCmd_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IssScriptId")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createIssScriptId(byte[] value) {
        return new JAXBElement<byte[]>(_IssScriptId_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MacValue")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createMacValue(byte[] value) {
        return new JAXBElement<byte[]>(_MacValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MacVariant")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createMacVariant(byte[] value) {
        return new JAXBElement<byte[]>(_MacVariant_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgAuthCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MsgAuthCode")
    public JAXBElement<MsgAuthCodeType> createMsgAuthCode(MsgAuthCodeType value) {
        return new JAXBElement<MsgAuthCodeType>(_MsgAuthCode_QNAME, MsgAuthCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NSFCountYTD")
    public JAXBElement<String> createNSFCountYTD(String value) {
        return new JAXBElement<String>(_NSFCountYTD_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "LastNSFDate")
    public JAXBElement<XMLGregorianCalendar> createLastNSFDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastNSFDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "LastNSFAmt")
    public JAXBElement<CurrencyAmount> createLastNSFAmt(CurrencyAmount value) {
        return new JAXBElement<CurrencyAmount>(_LastNSFAmt_QNAME, CurrencyAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OrigIssueDt")
    public JAXBElement<XMLGregorianCalendar> createOrigIssueDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrigIssueDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OwnerPercent")
    public JAXBElement<BigDecimal> createOwnerPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OwnerPercent_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OwnerInd")
    public JAXBElement<Boolean> createOwnerInd(Boolean value) {
        return new JAXBElement<Boolean>(_OwnerInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OpenAcctInd")
    public JAXBElement<Boolean> createOpenAcctInd(Boolean value) {
        return new JAXBElement<Boolean>(_OpenAcctInd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PrimaryOwner")
    public JAXBElement<Boolean> createPrimaryOwner(Boolean value) {
        return new JAXBElement<Boolean>(_PrimaryOwner_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRel")
    public JAXBElement<PartyAcctRelType> createPartyAcctRel(PartyAcctRelType value) {
        return new JAXBElement<PartyAcctRelType>(_PartyAcctRel_QNAME, PartyAcctRelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelDesc")
    public JAXBElement<String> createPartyAcctRelDesc(String value) {
        return new JAXBElement<String>(_PartyAcctRelDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelInfo")
    public JAXBElement<PartyAcctRelInfoType> createPartyAcctRelInfo(PartyAcctRelInfoType value) {
        return new JAXBElement<PartyAcctRelInfoType>(_PartyAcctRelInfo_QNAME, PartyAcctRelInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelId")
    public JAXBElement<String> createPartyAcctRelId(String value) {
        return new JAXBElement<String>(_PartyAcctRelId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelRec")
    public JAXBElement<PartyAcctRelRecType> createPartyAcctRelRec(PartyAcctRelRecType value) {
        return new JAXBElement<PartyAcctRelRecType>(_PartyAcctRelRec_QNAME, PartyAcctRelRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelStatusCode")
    public JAXBElement<String> createPartyAcctRelStatusCode(String value) {
        return new JAXBElement<String>(_PartyAcctRelStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyAcctRelStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelStatus")
    public JAXBElement<PartyAcctRelStatusType> createPartyAcctRelStatus(PartyAcctRelStatusType value) {
        return new JAXBElement<PartyAcctRelStatusType>(_PartyAcctRelStatus_QNAME, PartyAcctRelStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelType")
    public JAXBElement<String> createPartyAcctRelType(String value) {
        return new JAXBElement<String>(_PartyAcctRelType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartyAcctRelSubType")
    public JAXBElement<String> createPartyAcctRelSubType(String value) {
        return new JAXBElement<String>(_PartyAcctRelSubType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointOfServiceDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PointOfServiceData")
    public JAXBElement<PointOfServiceDataType> createPointOfServiceData(PointOfServiceDataType value) {
        return new JAXBElement<PointOfServiceDataType>(_PointOfServiceData_QNAME, PointOfServiceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "POSLocation")
    public JAXBElement<String> createPOSLocation(String value) {
        return new JAXBElement<String>(_POSLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POSSecurityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "POSSecurity")
    public JAXBElement<POSSecurityType> createPOSSecurity(POSSecurityType value) {
        return new JAXBElement<POSSecurityType>(_POSSecurity_QNAME, POSSecurityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POSCapabilitiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "POSCapabilities")
    public JAXBElement<POSCapabilitiesType> createPOSCapabilities(POSCapabilitiesType value) {
        return new JAXBElement<POSCapabilitiesType>(_POSCapabilities_QNAME, POSCapabilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POSAgentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "POSAgent")
    public JAXBElement<POSAgentType> createPOSAgent(POSAgentType value) {
        return new JAXBElement<POSAgentType>(_POSAgent_QNAME, POSAgentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "POSAttended")
    public JAXBElement<Boolean> createPOSAttended(Boolean value) {
        return new JAXBElement<Boolean>(_POSAttended_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "POSOperation")
    public JAXBElement<String> createPOSOperation(String value) {
        return new JAXBElement<String>(_POSOperation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "POSEntryCapability")
    public JAXBElement<String> createPOSEntryCapability(String value) {
        return new JAXBElement<String>(_POSEntryCapability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "POSCaptureCapability")
    public JAXBElement<Boolean> createPOSCaptureCapability(Boolean value) {
        return new JAXBElement<Boolean>(_POSCaptureCapability_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "POSVerifyCapability")
    public JAXBElement<String> createPOSVerifyCapability(String value) {
        return new JAXBElement<String>(_POSVerifyCapability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "POSOutCapabilities")
    public JAXBElement<String> createPOSOutCapabilities(String value) {
        return new JAXBElement<String>(_POSOutCapabilities_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PrimaryAcct")
    public JAXBElement<Boolean> createPrimaryAcct(Boolean value) {
        return new JAXBElement<Boolean>(_PrimaryAcct_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PSSNetworkType")
    public JAXBElement<String> createPSSNetworkType(String value) {
        return new JAXBElement<String>(_PSSNetworkType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PSSMsgMAC")
    public JAXBElement<String> createPSSMsgMAC(String value) {
        return new JAXBElement<String>(_PSSMsgMAC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PSSMsgEncryption")
    public JAXBElement<String> createPSSMsgEncryption(String value) {
        return new JAXBElement<String>(_PSSMsgEncryption_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PSSCATSecLevel")
    public JAXBElement<String> createPSSCATSecLevel(String value) {
        return new JAXBElement<String>(_PSSCATSecLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PswdDeliveryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PswdDelivery")
    public JAXBElement<PswdDeliveryType> createPswdDelivery(PswdDeliveryType value) {
        return new JAXBElement<PswdDeliveryType>(_PswdDelivery_QNAME, PswdDeliveryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SecAmt")
    public JAXBElement<CurrencyAmount> createSecAmt(CurrencyAmount value) {
        return new JAXBElement<CurrencyAmount>(_SecAmt_QNAME, CurrencyAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SecObjId")
    public JAXBElement<String> createSecObjId(String value) {
        return new JAXBElement<String>(_SecObjId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ServerTerminalSeqId")
    public JAXBElement<String> createServerTerminalSeqId(String value) {
        return new JAXBElement<String>(_ServerTerminalSeqId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TerminalCaps")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createTerminalCaps(byte[] value) {
        return new JAXBElement<byte[]>(_TerminalCaps_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TerminalCountryCode")
    public JAXBElement<String> createTerminalCountryCode(String value) {
        return new JAXBElement<String>(_TerminalCountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TerminalVrfyRslt")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createTerminalVrfyRslt(byte[] value) {
        return new JAXBElement<byte[]>(_TerminalVrfyRslt_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TINInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TINInfo")
    public JAXBElement<TINInfoType> createTINInfo(TINInfoType value) {
        return new JAXBElement<TINInfoType>(_TINInfo_QNAME, TINInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TINType")
    public JAXBElement<String> createTINType(String value) {
        return new JAXBElement<String>(_TINType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Trk2EquivData")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createTrk2EquivData(byte[] value) {
        return new JAXBElement<byte[]>(_Trk2EquivData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TrnDt")
    public JAXBElement<XMLGregorianCalendar> createTrnDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrnDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TrnStatInfo")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createTrnStatInfo(byte[] value) {
        return new JAXBElement<byte[]>(_TrnStatInfo_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "UnpredictNum")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createUnpredictNum(byte[] value) {
        return new JAXBElement<byte[]>(_UnpredictNum_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ModPendingType")
    public JAXBElement<String> createModPendingType(String value) {
        return new JAXBElement<String>(_ModPendingType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NetworkOwner")
    public JAXBElement<String> createNetworkOwner(String value) {
        return new JAXBElement<String>(_NetworkOwner_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TerminalId")
    public JAXBElement<String> createTerminalId(String value) {
        return new JAXBElement<String>(_TerminalId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NetworkRefId")
    public JAXBElement<String> createNetworkRefId(String value) {
        return new JAXBElement<String>(_NetworkRefId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OriginatorName")
    public JAXBElement<String> createOriginatorName(String value) {
        return new JAXBElement<String>(_OriginatorName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SvcRqUID")
    public JAXBElement<String> createSvcRqUID(String value) {
        return new JAXBElement<String>(_SvcRqUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepAppInfo")
    public JAXBElement<DepAppInfoType> createDepAppInfo(DepAppInfoType value) {
        return new JAXBElement<DepAppInfoType>(_DepAppInfo_QNAME, DepAppInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppAcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepAppAcctId")
    public JAXBElement<DepAppAcctIdType> createDepAppAcctId(DepAppAcctIdType value) {
        return new JAXBElement<DepAppAcctIdType>(_DepAppAcctId_QNAME, DepAppAcctIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepAppRec")
    public JAXBElement<DepAppRecType> createDepAppRec(DepAppRecType value) {
        return new JAXBElement<DepAppRecType>(_DepAppRec_QNAME, DepAppRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepAppId")
    public JAXBElement<String> createDepAppId(String value) {
        return new JAXBElement<String>(_DepAppId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepAppStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepAppStatus")
    public JAXBElement<DepAppStatusType> createDepAppStatus(DepAppStatusType value) {
        return new JAXBElement<DepAppStatusType>(_DepAppStatus_QNAME, DepAppStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepAppStatusCode")
    public JAXBElement<String> createDepAppStatusCode(String value) {
        return new JAXBElement<String>(_DepAppStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepApplicantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepApplicant")
    public JAXBElement<DepApplicantType> createDepApplicant(DepApplicantType value) {
        return new JAXBElement<DepApplicantType>(_DepApplicant_QNAME, DepApplicantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DepApplicantAcctRel")
    public JAXBElement<String> createDepApplicantAcctRel(String value) {
        return new JAXBElement<String>(_DepApplicantAcctRel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverdraftFundingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OverdraftFunding")
    public JAXBElement<OverdraftFundingType> createOverdraftFunding(OverdraftFundingType value) {
        return new JAXBElement<OverdraftFundingType>(_OverdraftFunding_QNAME, OverdraftFundingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FundingPriority")
    public JAXBElement<String> createFundingPriority(String value) {
        return new JAXBElement<String>(_FundingPriority_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FundingInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FundingInfo")
    public JAXBElement<FundingInfoType> createFundingInfo(FundingInfoType value) {
        return new JAXBElement<FundingInfoType>(_FundingInfo_QNAME, FundingInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AmtQualifier")
    public JAXBElement<String> createAmtQualifier(String value) {
        return new JAXBElement<String>(_AmtQualifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SerialNum")
    public JAXBElement<String> createSerialNum(String value) {
        return new JAXBElement<String>(_SerialNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SerialNumEnd")
    public JAXBElement<String> createSerialNumEnd(String value) {
        return new JAXBElement<String>(_SerialNumEnd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SerialNumStart")
    public JAXBElement<String> createSerialNumStart(String value) {
        return new JAXBElement<String>(_SerialNumStart_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FindContact")
    public JAXBElement<Boolean> createFindContact(Boolean value) {
        return new JAXBElement<Boolean>(_FindContact_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FindOrg")
    public JAXBElement<Boolean> createFindOrg(Boolean value) {
        return new JAXBElement<Boolean>(_FindOrg_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FindAll")
    public JAXBElement<Boolean> createFindAll(Boolean value) {
        return new JAXBElement<Boolean>(_FindAll_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SrchOperator")
    public JAXBElement<String> createSrchOperator(String value) {
        return new JAXBElement<String>(_SrchOperator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DetailType")
    public JAXBElement<String> createDetailType(String value) {
        return new JAXBElement<String>(_DetailType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Requestor")
    public JAXBElement<String> createRequestor(String value) {
        return new JAXBElement<String>(_Requestor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NoteNumStart")
    public JAXBElement<String> createNoteNumStart(String value) {
        return new JAXBElement<String>(_NoteNumStart_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NoteNumEnd")
    public JAXBElement<String> createNoteNumEnd(String value) {
        return new JAXBElement<String>(_NoteNumEnd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriversLicenseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DriversLicense")
    public JAXBElement<DriversLicenseType> createDriversLicense(DriversLicenseType value) {
        return new JAXBElement<DriversLicenseType>(_DriversLicense_QNAME, DriversLicenseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "EmploymentStatus")
    public JAXBElement<String> createEmploymentStatus(String value) {
        return new JAXBElement<String>(_EmploymentStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncomeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Income")
    public JAXBElement<IncomeType> createIncome(IncomeType value) {
        return new JAXBElement<IncomeType>(_Income_QNAME, IncomeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "JobTitle")
    public JAXBElement<String> createJobTitle(String value) {
        return new JAXBElement<String>(_JobTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "LicenseNum")
    public JAXBElement<String> createLicenseNum(String value) {
        return new JAXBElement<String>(_LicenseNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NameAddrType")
    public JAXBElement<String> createNameAddrType(String value) {
        return new JAXBElement<String>(_NameAddrType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Occupation")
    public JAXBElement<String> createOccupation(String value) {
        return new JAXBElement<String>(_Occupation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PassportCountry")
    public JAXBElement<String> createPassportCountry(String value) {
        return new JAXBElement<String>(_PassportCountry_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PassportNumber")
    public JAXBElement<String> createPassportNumber(String value) {
        return new JAXBElement<String>(_PassportNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PersonName")
    public JAXBElement<PersonNameType> createPersonName(PersonNameType value) {
        return new JAXBElement<PersonNameType>(_PersonName_QNAME, PersonNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Passport")
    public JAXBElement<PassportType> createPassport(PassportType value) {
        return new JAXBElement<PassportType>(_Passport_QNAME, PassportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StateId")
    public JAXBElement<StateIdType> createStateId(StateIdType value) {
        return new JAXBElement<StateIdType>(_StateId_QNAME, StateIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IssDt")
    public JAXBElement<XMLGregorianCalendar> createIssDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IssDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IssueLoc")
    public JAXBElement<String> createIssueLoc(String value) {
        return new JAXBElement<String>(_IssueLoc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StateNumber")
    public JAXBElement<String> createStateNumber(String value) {
        return new JAXBElement<String>(_StateNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ItemType")
    public JAXBElement<String> createItemType(String value) {
        return new JAXBElement<String>(_ItemType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RelatedRmtInfo")
    public JAXBElement<String> createRelatedRmtInfo(String value) {
        return new JAXBElement<String>(_RelatedRmtInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "UnstructRmtInfo")
    public JAXBElement<String> createUnstructRmtInfo(String value) {
        return new JAXBElement<String>(_UnstructRmtInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructRmtInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StructRmtInfo")
    public JAXBElement<StructRmtInfoType> createStructRmtInfo(StructRmtInfoType value) {
        return new JAXBElement<StructRmtInfoType>(_StructRmtInfo_QNAME, StructRmtInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AmtPaid")
    public JAXBElement<String> createAmtPaid(String value) {
        return new JAXBElement<String>(_AmtPaid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "InvoiceAmt")
    public JAXBElement<String> createInvoiceAmt(String value) {
        return new JAXBElement<String>(_InvoiceAmt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DiscountAmt")
    public JAXBElement<String> createDiscountAmt(String value) {
        return new JAXBElement<String>(_DiscountAmt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AdjustmentInfo")
    public JAXBElement<String> createAdjustmentInfo(String value) {
        return new JAXBElement<String>(_AdjustmentInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SecondaryRmtDocInfo")
    public JAXBElement<String> createSecondaryRmtDocInfo(String value) {
        return new JAXBElement<String>(_SecondaryRmtDocInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RmtFreeText")
    public JAXBElement<String> createRmtFreeText(String value) {
        return new JAXBElement<String>(_RmtFreeText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PrimaryRmtDocInfo")
    public JAXBElement<String> createPrimaryRmtDocInfo(String value) {
        return new JAXBElement<String>(_PrimaryRmtDocInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RmtOrigInfo")
    public JAXBElement<String> createRmtOrigInfo(String value) {
        return new JAXBElement<String>(_RmtOrigInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RmtBnfInfo")
    public JAXBElement<String> createRmtBnfInfo(String value) {
        return new JAXBElement<String>(_RmtBnfInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RmtDocDt")
    public JAXBElement<String> createRmtDocDt(String value) {
        return new JAXBElement<String>(_RmtDocDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExDealStatus")
    public JAXBElement<ForExDealStatusType> createForExDealStatus(ForExDealStatusType value) {
        return new JAXBElement<ForExDealStatusType>(_ForExDealStatus_QNAME, ForExDealStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExDealStatusCode")
    public JAXBElement<String> createForExDealStatusCode(String value) {
        return new JAXBElement<String>(_ForExDealStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "RateType")
    public JAXBElement<String> createRateType(String value) {
        return new JAXBElement<String>(_RateType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BuyRates")
    public JAXBElement<RatesType> createBuyRates(RatesType value) {
        return new JAXBElement<RatesType>(_BuyRates_QNAME, RatesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SellRates")
    public JAXBElement<RatesType> createSellRates(RatesType value) {
        return new JAXBElement<RatesType>(_SellRates_QNAME, RatesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PersonInfo")
    public JAXBElement<PersonInfoType> createPersonInfo(PersonInfoType value) {
        return new JAXBElement<PersonInfoType>(_PersonInfo_QNAME, PersonInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Dependents")
    public JAXBElement<Long> createDependents(Long value) {
        return new JAXBElement<Long>(_Dependents_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Gender")
    public JAXBElement<String> createGender(String value) {
        return new JAXBElement<String>(_Gender_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MaritalStatus")
    public JAXBElement<String> createMaritalStatus(String value) {
        return new JAXBElement<String>(_MaritalStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "MotherMaidenName")
    public JAXBElement<String> createMotherMaidenName(String value) {
        return new JAXBElement<String>(_MotherMaidenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OEDCode")
    public JAXBElement<String> createOEDCode(String value) {
        return new JAXBElement<String>(_OEDCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OEDInstitution")
    public JAXBElement<String> createOEDInstitution(String value) {
        return new JAXBElement<String>(_OEDInstitution_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SpouseName")
    public JAXBElement<String> createSpouseName(String value) {
        return new JAXBElement<String>(_SpouseName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "USA.MilitaryRank")
    public JAXBElement<String> createUSAMilitaryRank(String value) {
        return new JAXBElement<String>(_USAMilitaryRank_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OffsetId")
    public JAXBElement<String> createOffsetId(String value) {
        return new JAXBElement<String>(_OffsetId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OffsetPmtId")
    public JAXBElement<String> createOffsetPmtId(String value) {
        return new JAXBElement<String>(_OffsetPmtId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ContractBalance")
    public JAXBElement<CurrencyAmount> createContractBalance(CurrencyAmount value) {
        return new JAXBElement<CurrencyAmount>(_ContractBalance_QNAME, CurrencyAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForExDealSyncObjType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ForExDealSyncObj")
    public JAXBElement<ForExDealSyncObjType> createForExDealSyncObj(ForExDealSyncObjType value) {
        return new JAXBElement<ForExDealSyncObjType>(_ForExDealSyncObj_QNAME, ForExDealSyncObjType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SettlementSummary")
    public JAXBElement<SettlementSummaryType> createSettlementSummary(SettlementSummaryType value) {
        return new JAXBElement<SettlementSummaryType>(_SettlementSummary_QNAME, SettlementSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Destination")
    public JAXBElement<String> createDestination(String value) {
        return new JAXBElement<String>(_Destination_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ISN")
    public JAXBElement<String> createISN(String value) {
        return new JAXBElement<String>(_ISN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Field20")
    public JAXBElement<String> createField20(String value) {
        return new JAXBElement<String>(_Field20_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DraftPdInd")
    public JAXBElement<String> createDraftPdInd(String value) {
        return new JAXBElement<String>(_DraftPdInd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DrawdownSeqNum")
    public JAXBElement<Long> createDrawdownSeqNum(Long value) {
        return new JAXBElement<Long>(_DrawdownSeqNum_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GovIssueIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GovIssueIdent")
    public JAXBElement<GovIssueIdentType> createGovIssueIdent(GovIssueIdentType value) {
        return new JAXBElement<GovIssueIdentType>(_GovIssueIdent_QNAME, GovIssueIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GovOrgName")
    public JAXBElement<String> createGovOrgName(String value) {
        return new JAXBElement<String>(_GovOrgName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GovRank")
    public JAXBElement<String> createGovRank(String value) {
        return new JAXBElement<String>(_GovRank_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GovIssueIdentType")
    public JAXBElement<String> createGovIssueIdentType(String value) {
        return new JAXBElement<String>(_GovIssueIdentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "GovOrg")
    public JAXBElement<String> createGovOrg(String value) {
        return new JAXBElement<String>(_GovOrg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IdentSerialNum")
    public JAXBElement<String> createIdentSerialNum(String value) {
        return new JAXBElement<String>(_IdentSerialNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherIdentDocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "OtherIdentDoc")
    public JAXBElement<OtherIdentDocType> createOtherIdentDoc(OtherIdentDocType value) {
        return new JAXBElement<OtherIdentDocType>(_OtherIdentDoc_QNAME, OtherIdentDocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Issuer")
    public JAXBElement<String> createIssuer(String value) {
        return new JAXBElement<String>(_Issuer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FileContent")
    public JAXBElement<String> createFileContent(String value) {
        return new JAXBElement<String>(_FileContent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FileHashType")
    public JAXBElement<String> createFileHashType(String value) {
        return new JAXBElement<String>(_FileHashType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FileHashValue")
    public JAXBElement<String> createFileHashValue(String value) {
        return new JAXBElement<String>(_FileHashValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FileName")
    public JAXBElement<String> createFileName(String value) {
        return new JAXBElement<String>(_FileName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FileNumber")
    public JAXBElement<String> createFileNumber(String value) {
        return new JAXBElement<String>(_FileNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "HostFileNumber")
    public JAXBElement<String> createHostFileNumber(String value) {
        return new JAXBElement<String>(_HostFileNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FileType")
    public JAXBElement<String> createFileType(String value) {
        return new JAXBElement<String>(_FileType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "EventName")
    public JAXBElement<String> createEventName(String value) {
        return new JAXBElement<String>(_EventName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TransSucceded")
    public JAXBElement<Long> createTransSucceded(Long value) {
        return new JAXBElement<Long>(_TransSucceded_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TransFailed")
    public JAXBElement<Long> createTransFailed(Long value) {
        return new JAXBElement<Long>(_TransFailed_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TransSkipped")
    public JAXBElement<Long> createTransSkipped(Long value) {
        return new JAXBElement<Long>(_TransSkipped_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PartnerId")
    public JAXBElement<String> createPartnerId(String value) {
        return new JAXBElement<String>(_PartnerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TotalTransactions")
    public JAXBElement<Long> createTotalTransactions(Long value) {
        return new JAXBElement<Long>(_TotalTransactions_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "TransProccessed")
    public JAXBElement<Long> createTransProccessed(Long value) {
        return new JAXBElement<Long>(_TransProccessed_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FileStatus")
    public JAXBElement<String> createFileStatus(String value) {
        return new JAXBElement<String>(_FileStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FullBillerListURL")
    public JAXBElement<String> createFullBillerListURL(String value) {
        return new JAXBElement<String>(_FullBillerListURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BSPReferToType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BSPReferTo")
    public JAXBElement<BSPReferToType> createBSPReferTo(BSPReferToType value) {
        return new JAXBElement<BSPReferToType>(_BSPReferTo_QNAME, BSPReferToType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillerInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillerInfo")
    public JAXBElement<BillerInfoType> createBillerInfo(BillerInfoType value) {
        return new JAXBElement<BillerInfoType>(_BillerInfo_QNAME, BillerInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillerAcctIdInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillerAcctIdInfo")
    public JAXBElement<BillerAcctIdInfoType> createBillerAcctIdInfo(BillerAcctIdInfoType value) {
        return new JAXBElement<BillerAcctIdInfoType>(_BillerAcctIdInfo_QNAME, BillerAcctIdInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctFormat")
    public JAXBElement<String> createAcctFormat(String value) {
        return new JAXBElement<String>(_AcctFormat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctHelpMsg")
    public JAXBElement<String> createAcctHelpMsg(String value) {
        return new JAXBElement<String>(_AcctHelpMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctRestrictMsg")
    public JAXBElement<String> createAcctRestrictMsg(String value) {
        return new JAXBElement<String>(_AcctRestrictMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AcctValidateURL")
    public JAXBElement<String> createAcctValidateURL(String value) {
        return new JAXBElement<String>(_AcctValidateURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillerEnrollURL")
    public JAXBElement<String> createBillerEnrollURL(String value) {
        return new JAXBElement<String>(_BillerEnrollURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillerStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillerStatus")
    public JAXBElement<BillerStatusType> createBillerStatus(BillerStatusType value) {
        return new JAXBElement<BillerStatusType>(_BillerStatus_QNAME, BillerStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillerStatusCode")
    public JAXBElement<String> createBillerStatusCode(String value) {
        return new JAXBElement<String>(_BillerStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "CSPCustInfoReq")
    public JAXBElement<Boolean> createCSPCustInfoReq(Boolean value) {
        return new JAXBElement<Boolean>(_CSPCustInfoReq_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DiscDt")
    public JAXBElement<XMLGregorianCalendar> createDiscDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DiscDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DiscId")
    public JAXBElement<String> createDiscId(String value) {
        return new JAXBElement<String>(_DiscId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "DiscReqd")
    public JAXBElement<Boolean> createDiscReqd(Boolean value) {
        return new JAXBElement<Boolean>(_DiscReqd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Logo")
    public JAXBElement<LogoType> createLogo(LogoType value) {
        return new JAXBElement<LogoType>(_Logo_QNAME, LogoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "LogoURL")
    public JAXBElement<String> createLogoURL(String value) {
        return new JAXBElement<String>(_LogoURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecretPromptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SecretPrompt")
    public JAXBElement<SecretPromptType> createSecretPrompt(SecretPromptType value) {
        return new JAXBElement<SecretPromptType>(_SecretPrompt_QNAME, SecretPromptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "Prompt")
    public JAXBElement<String> createPrompt(String value) {
        return new JAXBElement<String>(_Prompt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SecretFormat")
    public JAXBElement<String> createSecretFormat(String value) {
        return new JAXBElement<String>(_SecretFormat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SecretMask")
    public JAXBElement<String> createSecretMask(String value) {
        return new JAXBElement<String>(_SecretMask_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "SecretOptional")
    public JAXBElement<Boolean> createSecretOptional(Boolean value) {
        return new JAXBElement<Boolean>(_SecretOptional_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "IndustInfo")
    public JAXBElement<IndustInfoType> createIndustInfo(IndustInfoType value) {
        return new JAXBElement<IndustInfoType>(_IndustInfo_QNAME, IndustInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "FileStatusCode")
    public JAXBElement<String> createFileStatusCode(String value) {
        return new JAXBElement<String>(_FileStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "AllocateAllowed")
    public JAXBElement<Boolean> createAllocateAllowed(Boolean value) {
        return new JAXBElement<Boolean>(_AllocateAllowed_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillInfo")
    public JAXBElement<BillInfoType> createBillInfo(BillInfoType value) {
        return new JAXBElement<BillInfoType>(_BillInfo_QNAME, BillInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillSummAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillSummAmt")
    public JAXBElement<BillSummAmtType> createBillSummAmt(BillSummAmtType value) {
        return new JAXBElement<BillSummAmtType>(_BillSummAmt_QNAME, BillSummAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillSummAmtType")
    public JAXBElement<String> createBillSummAmtType(String value) {
        return new JAXBElement<String>(_BillSummAmtType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillSummSubAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillSummSubAmt")
    public JAXBElement<BillSummSubAmtType> createBillSummSubAmt(BillSummSubAmtType value) {
        return new JAXBElement<BillSummSubAmtType>(_BillSummSubAmt_QNAME, BillSummSubAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillSummAmtCode")
    public JAXBElement<String> createBillSummAmtCode(String value) {
        return new JAXBElement<String>(_BillSummAmtCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillPmtStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillPmtStatus")
    public JAXBElement<BillPmtStatusType> createBillPmtStatus(BillPmtStatusType value) {
        return new JAXBElement<BillPmtStatusType>(_BillPmtStatus_QNAME, BillPmtStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillStatus")
    public JAXBElement<BillStatusType> createBillStatus(BillStatusType value) {
        return new JAXBElement<BillStatusType>(_BillStatus_QNAME, BillStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillPmtStatusCountsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillPmtStatusCounts")
    public JAXBElement<BillPmtStatusCountsType> createBillPmtStatusCounts(BillPmtStatusCountsType value) {
        return new JAXBElement<BillPmtStatusCountsType>(_BillPmtStatusCounts_QNAME, BillPmtStatusCountsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillStatusCountsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillStatusCounts")
    public JAXBElement<BillStatusCountsType> createBillStatusCounts(BillStatusCountsType value) {
        return new JAXBElement<BillStatusCountsType>(_BillStatusCounts_QNAME, BillStatusCountsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "BillDt")
    public JAXBElement<XMLGregorianCalendar> createBillDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BillDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ImageURL")
    public JAXBElement<String> createImageURL(String value) {
        return new JAXBElement<String>(_ImageURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "NotifyReqd")
    public JAXBElement<Boolean> createNotifyReqd(Boolean value) {
        return new JAXBElement<Boolean>(_NotifyReqd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "EarliestPmtDt")
    public JAXBElement<XMLGregorianCalendar> createEarliestPmtDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EarliestPmtDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PmtPeriod")
    public JAXBElement<String> createPmtPeriod(String value) {
        return new JAXBElement<String>(_PmtPeriod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PresAcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PresAcctId")
    public JAXBElement<PresAcctIdType> createPresAcctId(PresAcctIdType value) {
        return new JAXBElement<PresAcctIdType>(_PresAcctId_QNAME, PresAcctIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "PrefetchURL")
    public JAXBElement<String> createPrefetchURL(String value) {
        return new JAXBElement<String>(_PrefetchURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ShortDesc")
    public JAXBElement<String> createShortDesc(String value) {
        return new JAXBElement<String>(_ShortDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StmtImageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "StmtImage")
    public JAXBElement<StmtImageType> createStmtImage(StmtImageType value) {
        return new JAXBElement<StmtImageType>(_StmtImage_QNAME, StmtImageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aciworldwide.com/S1Adapter", name = "ViewDtlPref")
    public JAXBElement<String> createViewDtlPref(String value) {
        return new JAXBElement<String>(_ViewDtlPref_QNAME, String.class, null, value);
    }

}
