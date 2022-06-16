package chainofresponsability;

public class TipoDocumentoRescisaoContrato implements TipoDocumento {

    private static TipoDocumentoRescisaoContrato tipoDocumentoRescisaoContrato = new TipoDocumentoRescisaoContrato();

    private TipoDocumentoRescisaoContrato() {};

    public static TipoDocumentoRescisaoContrato getTipoDocumentoRescisaoContrato() {
        return tipoDocumentoRescisaoContrato;
    }


}
