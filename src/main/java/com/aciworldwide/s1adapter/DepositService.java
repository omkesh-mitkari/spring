package com.aciworldwide.s1adapter;
import java.util.HashMap;
import java.util.Map;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aciworldwide.s1adapter.BankAcctImgSrchOutType;
import com.aciworldwide.s1adapter.BankAcctImgSrchRs;
import com.google.gson.Gson;


@RestController
@RequestMapping(value="/statement/deposit")
public class DepositService implements AcountStatementPortType
{

	@Consumes("application/json")
	@RequestMapping(value="/obj", method=RequestMethod.POST,consumes="application/json")
	 public com.aciworldwide.s1adapter.BankAcctImgSrchOutType accImgSearch(
		        @RequestBody com.aciworldwide.s1adapter.BankAcctImgSrchInpType request
		    ) throws DepositAcctStmtRs{
		BankAcctImgSrchOutType newObj=new BankAcctImgSrchOutType();
		//System.out.println("HEKFJKSDJFKSFKLSDFJKLFHSDFHHHHHHHHHHHHHHHHHHHHHHHHHHHHH844444444888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888");
		BankAcctImgSrchRs newBankImg=new BankAcctImgSrchRs();
		BankAcctImgSrchRq ba=request.getBankAcctImgSrchRq();
		//System.out.println(request+"   pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp");
		newBankImg.setRqUID(ba.getRqUID());
		newBankImg.setAsyncRqUID(ba.getAsyncRqUID());
		newObj.setBankAcctImgSrchRs(newBankImg);
		SignonRs s=new SignonRs();
		newObj.setSignonRs(s);
		return newObj;
		     
	 }
	@RequestMapping(value="/", method=RequestMethod.GET)
	public BankAcctImgSrchInpType accept_service()
	{
		BankAcctImgSrchInpType obj=new BankAcctImgSrchInpType();
		
		BankAcctImgSrchRq b=new BankAcctImgSrchRq();
		b.setRqUID("01");
		b.setAsyncRqUID("3");
	 
		SignonRq r=new SignonRq();
		obj.setBankAcctImgSrchRq(b);
		obj.setSignonRq(r);
		/*Gson gson = new Gson();
		String json1 = gson.toJson(obj);

		System.out.println(json1);
		return json1;*/
		
		return obj;
		
	}

    @WebMethod(operationName = "DepositStatement")
    @WebResult(name = "response", targetNamespace = "", partName = "response")
    public com.aciworldwide.s1adapter.DepAcctStmtInqOutType depositStatement(
        @WebParam(partName = "request", name = "request", targetNamespace = "")
        com.aciworldwide.s1adapter.DepAcctStmtInqInpType request
    ) throws DepositAcctStmtRs{
    	return new DepAcctStmtInqOutType();
    }

    @WebMethod(operationName = "LoanStatement")
    @WebResult(name = "responce", targetNamespace = "", partName = "responce")
    public com.aciworldwide.s1adapter.LoanAcctStmtInqOutType loanStatement(
        @WebParam(partName = "request", name = "request", targetNamespace = "")
        com.aciworldwide.s1adapter.LoanAcctStmtInqInpType request
    ) throws DepositAcctStmtRs{
    	return new LoanAcctStmtInqOutType();
    }

    @WebMethod(operationName = "CCStatement")
    @WebResult(name = "responce", targetNamespace = "", partName = "responce")
    public com.aciworldwide.s1adapter.CCAcctStmtInqOutType ccStatement(
        @WebParam(partName = "request", name = "request", targetNamespace = "")
        com.aciworldwide.s1adapter.CCAcctStmtInqInpType request
    ) throws DepositAcctStmtRs{
    	return new CCAcctStmtInqOutType();
    }

    @WebMethod(operationName = "AccImgTrn")
    @WebResult(name = "responce", targetNamespace = "", partName = "responce")
    public com.aciworldwide.s1adapter.BankAcctTrnImgInqOutType accImgTrn(
        @WebParam(partName = "request", name = "request", targetNamespace = "")
        com.aciworldwide.s1adapter.BankAcctTrnImgInqInpType request
    ) throws DepositAcctStmtRs{
    	
    	return new BankAcctTrnImgInqOutType();
    }
}
