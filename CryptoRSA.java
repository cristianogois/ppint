import java.io.*;
import javax.crypto.*;
import java.security.*;
import java.security.spec.*;
import java.security.cert.*;

public class CryptoRSA {
	private byte[] textoCifrado;
	private byte[] textoDecifrado;

	public CryptoRSA() {
		textoCifrado = null;
		textoDecifrado = null;
	}

	public void geraParDeChaves(File fPub, File fPvk) throws IOException, NoSuchAlgorithmException,
			InvalidAlgorithmParameterException, CertificateException, KeyStoreException {
		final int RSAKEYSIZE = 1024;
		KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
		kpg.initialize(new RSAKeyGenParameterSpec(RSAKEYSIZE, RSAKeyGenParameterSpec.F4));
		KeyPair kpr = kpg.generateKeyPair();
		PrivateKey oPriv = kpr.getPrivate();
		PublicKey oPub = kpr.getPublic();
		// -- Gravando a chave publica em formato serializado
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fPub));
		oos.writeObject(oPub);
		oos.close();
		// -- Gravando a chave privada em formato serializado
		oos = new ObjectOutputStream(new FileOutputStream(fPvk));
		oos.writeObject(oPriv);
		oos.close();
	}

	public void geraCifra(byte[] texto, File fPub)
			throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException,
			BadPaddingException, InvalidAlgorithmParameterException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fPub));
		PublicKey iPub = (PublicKey) ois.readObject();
		ois.close();
		Cipher rsacf = Cipher.getInstance("RSA");
		rsacf.init(Cipher.ENCRYPT_MODE, iPub);
		textoCifrado = rsacf.doFinal(texto);
	}

	public byte[] getTextoCifrado() throws Exception {
		return textoCifrado;
	}

	public void geraDecifra(byte[] texto, File fPrv)
			throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException,
			BadPaddingException, InvalidAlgorithmParameterException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fPrv));
		PrivateKey iPrv = (PrivateKey) ois.readObject();
		ois.close();
		Cipher rsacf = Cipher.getInstance("RSA");
		rsacf.init(Cipher.DECRYPT_MODE, iPrv);
		textoDecifrado = rsacf.doFinal(texto);
	}

	public byte[] getTextoDecifrado() throws Exception {
		return textoDecifrado;
	}
}