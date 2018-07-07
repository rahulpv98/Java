/*
 * Country.java
 * 
 * Copyright 2018 rahul p v <rahul p v@LAPTOP-OR0RK05T>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.*; 




public class Country {
	
	public static void main (String[] args) {
		HashMap<String , String > hm = new HashMap<>();
		hm.put("AF","Afghanistan");
		hm.put("AX","Aland Islands");
		hm.put("AL","Albania");
		hm.put("DZ","Algeria");
		hm.put("AS","American Samoa");
		hm.put("AD","Andorra");
		hm.put("AO","Angola");
		hm.put("AI","Anguilla");
		hm.put("AQ","Antarctica");
		hm.put("AG","Antigua and Barbuda");
		hm.put("AR","Argentina");
		hm.put("AM","Armenia");
		hm.put("AW","Aruba");
		hm.put("AU","Australia");
		hm.put("AT","Austria");
		hm.put("AZ","Azerbaijan");
		hm.put("BS","Bahamas");
		hm.put("BH","Bahrain");
		hm.put("BD","Bangladesh");
		hm.put("BB","Barbados");
		hm.put("BY","Belarus");
		hm.put("BE","Belgium");
		hm.put("BZ","Belize");
		hm.put("BJ","Benin");
		hm.put("BM","Bermuda");
		hm.put("BT","Bhutan");
		hm.put("BO","Bolivia");
		hm.put("BQ","Bonaire, Saint Eustatius and Saba");
		hm.put("BA","Bosnia and Herzegovina");
		hm.put("BW","Botswana");
		hm.put("BV","Bouvet Island");
		hm.put("BR","Brazil");
		hm.put("IO","British Indian Ocean Territory");
		hm.put("VG","British Virgin Islands");
		hm.put("BN","Brunei");
		hm.put("BG","Bulgaria");
		hm.put("BF","Burkina Faso");
		hm.put("BI","Burundi");
		hm.put("KH","Cambodia");
		hm.put("CM","Cameroon");
		hm.put("CA","Canada");
		hm.put("CV","Cape Verde");
		hm.put("KY","Cayman Islands");
		hm.put("CF","Central African Republic");
		hm.put("TD","Chad");
		hm.put("CL","Chile");
		hm.put("CN","China");
		hm.put("CX","Christmas Island");
		hm.put("CC","Cocos Islands");
		hm.put("CO","Colombia");
		hm.put("KM","Comoros");
		hm.put("CK","Cook Islands");
		hm.put("CR","Costa Rica");
		hm.put("HR","Croatia");
		hm.put("CU","Cuba");
		hm.put("CW","Curacao");
		hm.put("CY","Cyprus");
		hm.put("CZ","Czech Republic");
		hm.put("CD","Democratic Republic of the Congo");
		hm.put("DK","Denmark");
		hm.put("DJ","Djibouti");
		hm.put("DM","Dominica");
		hm.put("DO","Dominican Republic");
		hm.put("TL","East Timor");
		hm.put("EC","Ecuador");
		hm.put("EG","Egypt");
		hm.put("SV","El Salvador");
		hm.put("GQ","Equatorial Guinea");
		hm.put("ER","Eritrea");
		hm.put("EE","Estonia");
		hm.put("ET","Ethiopia");
		hm.put("FK","Falkland Islands");
		hm.put("FO","Faroe Islands");
		hm.put("FJ","Fiji");
		hm.put("FI","Finland");
		hm.put("FR","France");
		hm.put("GF","French Guiana");
		hm.put("PF","French Polynesia");
		hm.put("TF","French Southern Territories");
		hm.put("GA","Gabon");
		hm.put("GM","Gambia");
		hm.put("GE","Georgia");
		hm.put("DE","Germany");
		hm.put("GH","Ghana");
		hm.put("GI","Gibraltar");
		hm.put("GR","Greece");
		hm.put("GL","Greenland");
		hm.put("GD","Grenada");
		hm.put("GP","Guadeloupe");
		hm.put("GU","Guam");
		hm.put("GT","Guatemala");
		hm.put("GG","Guernsey");
		hm.put("GN","Guinea");
		hm.put("GW","Guinea-Bissau");
		hm.put("GY","Guyana");
		hm.put("HT","Haiti");
		hm.put("HM","Heard Island and McDonald Islands");
		hm.put("HN","Honduras");
		hm.put("HK","Hong Kong");
		hm.put("HU","Hungary");
		hm.put("IS","Iceland");
		hm.put("IN","India");
		hm.put("ID","Indonesia");
		hm.put("IR","Iran");
		hm.put("IQ","Iraq");
		hm.put("IE","Ireland");
		hm.put("IM","Isle of Man");
		hm.put("IL","Israel");
		hm.put("IT","Italy");
		hm.put("CI","Ivory Coast");
		hm.put("JM","Jamaica");
		hm.put("JP","Japan");
		hm.put("JE","Jersey");
		hm.put("JO","Jordan");
		hm.put("KZ","Kazakhstan");
		hm.put("KE","Kenya");
		hm.put("KI","Kiribati");
		hm.put("XK","Kosovo");
		hm.put("KW","Kuwait");
		hm.put("KG","Kyrgyzstan");
		hm.put("LA","Laos");
		hm.put("LV","Latvia");
		hm.put("LB","Lebanon");
		hm.put("LS","Lesotho");
		hm.put("LR","Liberia");
		hm.put("LY","Libya");
		hm.put("LI","Liechtenstein");
		hm.put("LT","Lithuania");
		hm.put("LU","Luxembourg");
		hm.put("MO","Macao");
		hm.put("MK","Macedonia");
		hm.put("MG","Madagascar");
		hm.put("MW","Malawi");
		hm.put("MY","Malaysia");
		hm.put("MV","Maldives");
		hm.put("ML","Mali");
		hm.put("MT","Malta");
		hm.put("MH","Marshall Islands");
		hm.put("MQ","Martinique");
		hm.put("MR","Mauritania");
		hm.put("MU","Mauritius");
		hm.put("YT","Mayotte");
		hm.put("MX","Mexico");
		hm.put("FM","Micronesia");
		hm.put("MD","Moldova");
		hm.put("MC","Monaco");
		hm.put("MN","Mongolia");
		hm.put("ME","Montenegro");
		hm.put("MS","Montserrat");
		hm.put("MA","Morocco");
		hm.put("MZ","Mozambique");
		hm.put("MM","Myanmar");
		hm.put("NA","Namibia");
		hm.put("NR","Nauru");
		hm.put("NP","Nepal");
		hm.put("NL","Netherlands");
		hm.put("AN","Netherlands Antilles");
		hm.put("NC","New Caledonia");
		hm.put("NZ","New Zealand");
		hm.put("NI","Nicaragua");
		hm.put("NE","Niger");
		hm.put("NG","Nigeria");
		hm.put("NU","Niue");
		hm.put("NF","Norfolk Island");
		hm.put("KP","North Korea");
		hm.put("MP","Northern Mariana Islands");
		hm.put("NO","Norway");
		hm.put("OM","Oman");
		hm.put("PK","Pakistan");
		hm.put("PW","Palau");
		hm.put("PS","Palestinian Territory");
		hm.put("PA","Panama");
		hm.put("PG","Papua New Guinea");
		hm.put("PY","Paraguay");
		hm.put("PE","Peru");
		hm.put("PH","Philippines");
		hm.put("PN","Pitcairn");
		hm.put("PL","Poland");
		hm.put("PT","Portugal");
		hm.put("PR","Puerto Rico");
		hm.put("QA","Qatar");
		hm.put("CG","Republic of the Congo");
		hm.put("RE","Reunion");
		hm.put("RO","Romania");
		hm.put("RU","Russia");
		hm.put("RW","Rwanda");
		hm.put("BL","Saint Barthelemy");
		hm.put("SH","Saint Helena");
		hm.put("KN","Saint Kitts and Nevis");
		hm.put("LC","Saint Lucia");
		hm.put("MF","Saint Martin");
		hm.put("PM","Saint Pierre and Miquelon");
		hm.put("VC","Saint Vincent and the Grenadines");
		hm.put("WS","Samoa");
		hm.put("SM","San Marino");
		hm.put("ST","Sao Tome and Principe");
		hm.put("SA","Saudi Arabia");
		hm.put("SN","Senegal");
		hm.put("RS","Serbia");
		hm.put("CS","Serbia and Montenegro");
		hm.put("SC","Seychelles");
		hm.put("SL","Sierra Leone");
		hm.put("SG","Singapore");
		hm.put("SX","Sint Maarten");
		hm.put("SK","Slovakia");
		hm.put("SI","Slovenia");
		hm.put("SB","Solomon Islands");
		hm.put("SO","Somalia");
		hm.put("ZA","South Africa");
		hm.put("GS","South Georgia and the South Sandwich Islands");
		hm.put("KR","South Korea");
		hm.put("SS","South Sudan");
		hm.put("ES","Spain");
		hm.put("LK","Sri Lanka");
		hm.put("SD","Sudan");
		hm.put("SR","Suriname");
		hm.put("SJ","Svalbard and Jan Mayen");
		hm.put("SZ","Swaziland");
		hm.put("SE","Sweden");
		hm.put("CH","Switzerland");
		hm.put("SY","Syria");
		hm.put("TW","Taiwan");
		hm.put("TJ","Tajikistan");
		hm.put("TZ","Tanzania");
		hm.put("TH","Thailand");
		hm.put("TG","Togo");
		hm.put("TK","Tokelau");
		hm.put("TO","Tonga");
		hm.put("TT","Trinidad and Tobago");
		hm.put("TN","Tunisia");
		hm.put("TR","Turkey");
		hm.put("TM","Turkmenistan");
		hm.put("TC","Turks and Caicos Islands");
		hm.put("TV","Tuvalu");
		hm.put("VI","U.S. Virgin Islands");
		hm.put("UG","Uganda");
		hm.put("UA","Ukraine");
		hm.put("AE","United Arab Emirates");
		hm.put("GB","United Kingdom");
		hm.put("US","United States");
		hm.put("UM","United States Minor Outlying Islands");
		hm.put("UY","Uruguay");
		hm.put("UZ","Uzbekistan");
		hm.put("VU","Vanuatu");
		hm.put("VA","Vatican");
		hm.put("VE","Venezuela");
		hm.put("VN","Vietnam");
		hm.put("WF","Wallis and Futuna");
		hm.put("EH","Western Sahara");
		hm.put("YE","Yemen");
		hm.put("ZM","Zambia");
		hm.put("ZW","Zimbabwe");
		Iterator <Map.Entry<String,String>> it = hm.entrySet().iterator();
		while(it.hasNext()){

       Map.Entry<String,String> pair = it.next();
    System.out.println(pair.getKey() + "=" + pair.getValue());
    }
    
    Scanner Scan=new Scanner(System.in);
    String a=Scan.next();
    String name = hm.get(a);
    System.out.println(name);
		
	}
}

