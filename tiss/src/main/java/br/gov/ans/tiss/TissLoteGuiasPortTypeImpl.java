package br.gov.ans.tiss;

import javax.jws.WebService;

import br.gov.ans.padroes.tiss.schemas.LoteGuiasWS;
import br.gov.ans.padroes.tiss.schemas.ProtocoloRecebimentoWS;
import br.gov.ans.tiss.ws.tipos.tissloteguias.v30201.TissFault;
import br.gov.ans.tiss.ws.tipos.tissloteguias.v30201.TissLoteGuiasPortType;

@WebService(targetNamespace = "http://localhost:8080/tiss/tissLoteGuiasv30201", 
			portName = "tissLoteGuias_Port", 
			serviceName = "tissLoteGuias", 
			endpointInterface = "br.gov.ans.tiss.ws.tipos.tissloteguias.v30201.TissLoteGuiasPortType")
public class TissLoteGuiasPortTypeImpl implements TissLoteGuiasPortType {

	public ProtocoloRecebimentoWS tissLoteGuiasOperation(LoteGuiasWS loteGuias)
			throws TissFault {
		// TODO Auto-generated method stub
		return null;
	}

}
