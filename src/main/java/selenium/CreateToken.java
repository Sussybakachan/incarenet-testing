package selenium;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import javax.crypto.Mac;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class CreateToken {
    private static final String TTAS_VM
            = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.Ing3SGpMSHVTZDdhdkZaT2x2NGZCT1hPVzlFb2VEZnJjSzdEUXFUWXhVRHgyNm1lTnpBWnN1MEZzN21rdUc0anEi.Em8fVPQ6Xe831Kf17F19cKqSLSuuhymvgakweaO9EhU";
    private static final String TTAS_CNX
            = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.IjdXNGM2OWpmRlNsVU5xR0xYaEl6RWE4YWZPdTI5ZlpQYkZRQk5hWEtnT3VCQVRYN3BqWUxIcHdjRk5mYnFWb3Ii.dB2wTg0fMAuRhGNk8YnVAsy7rGLFy2E2MSPjk0U_iB4";

    public static String buildJWT(String isoDate) throws NoSuchAlgorithmException, InvalidKeyException {

        byte[] keyBytes = TTAS_CNX.getBytes(StandardCharsets.UTF_8);
        Key key = Keys.hmacShaKeyFor(keyBytes);
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        sha256_HMAC.init(key);
        Map<String, Object> claims = new HashMap<>();
        claims.put("date", isoDate);
        String solName = "incardio-dashboard";
        claims.put("name", solName);
        Map<String, Object> map = new HashMap<>();
        map.put("X-DC-DATE", isoDate);
        map.put("X-DC-FRIEND", key);

        return Jwts
                .builder()
                .setHeader(map)
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS256, key )
                .compact();
    }

    /*public static String generateJwt(String secret, String solName) throws Exception {
        // Step 1: prepare header and payload
        String header = "{\"typ\": \"JWT\", \"alg\": \"HS256\"}";
        String date = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        String payload = {\"date\": \"" + date + "\", \"name\": \"" + solName + "\"};

        // Step 2: encode header and payload
        String encodedHeader = base64UrlEncode(header.getBytes(StandardCharsets.UTF_8));
        String encodedPayload = base64UrlEncode(payload.getBytes(StandardCharsets.UTF_8));

        // Step 3: create token
        String token = encodedHeader + "." + encodedPayload;

        // Step 4: sign token
        String signature = base64UrlEncode(hmacSha256(token, secret));

        // Step 5: create JWT
        String jwt = token + "." + signature;

        return jwt;
    }

    private static String base64UrlEncode(byte[] data) {
        String base64 = Base64.getEncoder().encodeToString(data);
        return base64.replace("=", "").replace("+", "-").replace("/", "_");
    }

    private static byte[] hmacSha256(String data, String secret) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec keySpec = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256");
        mac.init(keySpec);
        return mac.doFinal(data.getBytes("UTF-8"));
    }*/


}

/*
** TTAS/SOLTOKEN, to be found either* - in inSuite, in the Sol access manager (Sol Aktivierung)* - from inside the Sol as environment variable (e.g. accessible in node.js through process.env.SOLTOKEN)
const secret = 'sdgfas54f5sd4f42cx1v21s2d4f54are5tgfdhs',
        solName = 'mbega';

        // Step 1: prepare header and payload
        const
        header = {"typ": "JWT", "alg": "HS256"},
        date = (new Date()).toISOString(),
        payload = {"date": date, "name": solName };

        const
        base64url = (s) => CryptoJS.enc.Base64.stringify(s).replace(/=+$/, '').replace(/\+/g, '-').replace(/\//g, '_'),
        encodedHeader = base64url(CryptoJS.enc.Utf8.parse(JSON.stringify(header))),
        encodedPayload = base64url(CryptoJS.enc.Utf8.parse(JSON.stringify(payload))),
        token = encodedHeader + "." + encodedPayload,

        signature = base64url(CryptoJS.HmacSHA256(token, secret)),


        jwt = token + "." + signature;

        console.log(`Setting request HTTP headers:`, {
        "X-DC-DATE": date,
        "X-DC-FRIEND": jwt
        });

        pm.request.headers.add({key: 'X-DC-DATE', value: date });
        pm.request.headers.add({key: 'X-DC-FRIEND', value: jwt });*/
