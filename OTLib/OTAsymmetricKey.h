/*************************************************************
 *    
 *  OTAsymmetricKey.h
 *  
 */

/************************************************************
 -----BEGIN PGP SIGNED MESSAGE-----
 Hash: SHA256
 
 *                 OPEN TRANSACTIONS
 *
 *       Financial Cryptography and Digital Cash
 *       Library, Protocol, API, Server, and GUI 
 *    
 *    	 -- Anonymous Numbered Accounts.
 *    	 -- Untraceable Digital Cash.
 *    	 -- Triple-Signed Receipts.
 *    	 -- Cheques, Vouchers, Transfers, Inboxes.
 *    	 -- Basket Currencies, Markets, Payment Plans.
 *    	 -- Signed, XML, Ricardian-style Contracts.
 *    
 *  Copyright (C) 2010-2012 by "Fellow Traveler" (A pseudonym)
 *
 *  EMAIL:
 *  FellowTraveler@rayservers.net
 *  
 *  BITCOIN:  1NtTPVVjDsUfDWybS4BwvHpG2pdS9RnYyQ
 *
 *  KEY FINGERPRINT (PGP Key in license file):
 *  9DD5 90EB 9292 4B48 0484  7910 0308 00ED F951 BB8E
 *
 *  OFFICIAL PROJECT WIKI(s):
 *  https://github.com/FellowTraveler/Moneychanger
 *  https://github.com/FellowTraveler/Open-Transactions/wiki 
 *
 *  WEBSITE:
 *  http://www.OpenTransactions.org/
 *    
 *  Components and licensing:
 *   -- Moneychanger..A Java client GUI.....LICENSE:.....GPLv3
 *   -- OTLib.........A class library.......LICENSE:...LAGPLv3 
 *   -- OT-API........A client API..........LICENSE:...LAGPLv3
 *   -- testwallet....Command-line client...LICENSE:...LAGPLv3
 *   -- OT-Server.....Server Application....LICENSE:....AGPLv3
 *  Github.com/FellowTraveler/Open-Transactions/wiki/Components
 *
 *  All of the above OT components were designed and written by
 *  Fellow Traveler, with the exception of Moneychanger, which
 *  was contracted out to Vicky C (livewire_3001@yahoo.com).
 *
 *  -----------------------------------------------------
 *
 *   LICENSE:
 *   This program is free software: you can redistribute it
 *   and/or modify it under the terms of the GNU Affero
 *   General Public License as published by the Free Software
 *   Foundation, either version 3 of the License, or (at your
 *   option) any later version.
 *    
 *   ADDITIONAL PERMISSION under the GNU Affero GPL version 3
 *   section 7: (This paragraph applies only to the LAGPLv3
 *   components listed above.) If you modify this Program, or
 *   any covered work, by linking or combining it with other
 *   code, such other code is not for that reason alone subject
 *   to any of the requirements of the GNU Affero GPL version 3.
 *   (==> This means if you are only using the OT-API, then you
 *   don't have to open-source your code--only your changes to
 *   Open Transactions itself must be open source. Similar to
 *   LGPLv3, except it applies to software-as-a-service, not
 *   just to distributing binaries.)
 *
 *   Extra WAIVER for OpenSSL, Lucre, and all other libraries
 *   used by Open Transactions: This program is released under
 *   the AGPL with the additional exemption that compiling,
 *   linking, and/or using OpenSSL is allowed. The same is true
 *   for any other open source libraries included in this
 *   project: complete waiver from the AGPL is hereby granted to
 *   compile, link, and/or use them with Open Transactions,
 *   according to their own terms, as long as the rest of the
 *   Open Transactions terms remain respected, with regard to
 *   the Open Transactions code itself.
 *    
 *   Lucre License:
 *   This code is also "dual-license", meaning that Ben Lau-
 *   rie's license must also be included and respected, since
 *   the code for Lucre is also included with Open Transactions.
 *   See Open-Transactions/OTLib/Lucre/LUCRE_LICENSE.txt
 *   The Laurie requirements are light, but if there is any
 *   problem with his license, simply remove the Lucre code.
 *   Although there are no other blind token algorithms in Open
 *   Transactions (yet. credlib is coming), the other functions
 *   will continue to operate.
 *   -----------------------------------------------------
 *   You should have received a copy of the GNU Affero General
 *   Public License along with this program.  If not, see:
 *   http://www.gnu.org/licenses/
 *
 *   If you would like to use this software outside of the free
 *   software license, please contact FellowTraveler.
 *   (Unfortunately many will run anonymously and untraceably,
 *   so who could really stop them?)
 *   
 *   DISCLAIMER:
 *   This program is distributed in the hope that it will be
 *   useful, but WITHOUT ANY WARRANTY; without even the implied
 *   warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 *   PURPOSE.  See the GNU Affero General Public License for
 *   more details.
 -----BEGIN PGP SIGNATURE-----
 Version: GnuPG v1.4.11 (Darwin)
 
 iQIcBAEBCAAGBQJOjvvUAAoJEAMIAO35UbuOBlMP/1LX0xJ9CrTOe1G/mgc+VygT
 JPVZDAbQDL/lJXOZMbaPJ/GaLXyEnTViHp97ERrlVuBQz+9uonIKCmPqAGYGVBG1
 MGV2QcscXU2aOUT1VPf2OYEOIul0h8FX2lixfqouH9/OkVsGRLr79Zu8z3zdsO4R
 ktQtjZEU6lnL2t6cmp/cuXlQnbz1xvxd56xNDR11YP07Z4x+CuDB4EAK+P9TfCwn
 tqq5yJmxJM9HtMoi3cUU7kXodKm1n1YZt7O46DOxHqbXqErHChN1ekSK0fXad614
 Gmh+5JfvHjx5XoFWMxb46aAAcUiG8+QpFBcKtSYP2X96k1ylgxMCzrK60ec/MxKV
 BzvP00OJ6PzzrTlcUaCgJ8ZX+0scOMvW0XKioEorozKSWNFvT4Drc4Thhy8u9ET3
 ru1enNFrjdxKjw2+ZTQcKSZjSRx2kMQ2od/dkqUlhe/M1cHGhseH6ls7pItrkykE
 ufZ9GlZoxYE+FRatIBPneT9WwsvFFvH+i6cQ/MM9pbTr19g6VPzVZ4U9E65BbTDB
 czITynH+uMtJLbprtCdQlsI+vqTgYNoY8AUsmnr1qUkp020qGlvwfCJVrooisTmm
 yIh+Yp/KBzySU3inzclaAfv102/t5xi1l+GTyWHiwZxlyt5PBVglKWx/Ust9CIvN
 6h9BYZFTZrh/OwBXCdAv
 =MUfS
 -----END PGP SIGNATURE-----
 **************************************************************/


#ifndef __OT_ASYMMETRIC_KEY_H__
#define __OT_ASYMMETRIC_KEY_H__

#include <string>


extern "C"
{
#include <openssl/evp.h>	
}

#include "OTPassword.h"

// ------------------------------------------------

// This is the only part of the API that actually accepts objects as parameters,
// since the above objects have SWIG C++ wrappers. 
//
bool OT_API_Set_PasswordCallback(OTCaller & theCaller); // Caller must have Callback attached already.


// ------------------------------------------------
// For getting the password from the user, for using his private key.
//
extern "C"
{
typedef int OT_OPENSSL_CALLBACK(char *buf, int size, int rwflag, void *userdata); // <== Callback type, used for declaring.
	
	OT_OPENSSL_CALLBACK default_pass_cb;
	OT_OPENSSL_CALLBACK souped_up_pass_cb;
}
// ------------------------------------------------
// Used for the actual function definition (in the .cpp file).
//
#define OPENSSL_CALLBACK_FUNC(name) extern "C" int (name)(char *buf, int size, int rwflag, void *userdata)

// ------------------------------------------------

class OTString;
class OTASCIIArmor;


class OTAsymmetricKey
{
private:
	EVP_PKEY *	m_pKey; 
	bool		m_bIsPublicKey;
	bool		m_bIsPrivateKey;
	// --------------------------------------------
	
	static OT_OPENSSL_CALLBACK	* s_pwCallback; 
	static OTCaller				* s_pCaller;
	
public:
	
	static void SetPasswordCallback(OT_OPENSSL_CALLBACK * pCallback);
	static OT_OPENSSL_CALLBACK * GetPasswordCallback();
	static bool IsPasswordCallbackSet() { return (NULL == s_pwCallback) ? false : true; }
	
	static bool SetPasswordCaller(OTCaller & theCaller);
	static OTCaller * GetPasswordCaller();
	// -------------------------------------

	inline bool IsPublic()	{ return m_bIsPublicKey;  }
	inline bool IsPrivate() { return m_bIsPrivateKey; }
	
	// -------------------------------------
	OTAsymmetricKey();
	OTAsymmetricKey(const OTAsymmetricKey & rhs);
	virtual ~OTAsymmetricKey();
	
	OTAsymmetricKey & operator=(const OTAsymmetricKey & rhs);
	
	void Release();
    // ***************************************************************

	const
    EVP_PKEY *  GetKey() const;
	void        SetKey(EVP_PKEY * pKey, bool bIsPrivateKey=false);
	
    // ***************************************************************

	bool LoadPrivateKey(const OTString & strFoldername, const OTString & strFilename);
	bool LoadPublicKey (const OTString & strFoldername, const OTString & strFilename);
	
    // ***************************************************************

    // "escaped" means pre-pended with "- " as in:   - -----BEGIN CERTIFICATE....
    //
    bool LoadPrivateKeyFromCertString(const OTString & strCert, bool bEscaped=true);

    // ***************************************************************

	bool LoadPublicKeyFromCertString(const OTString & strCert, bool bEscaped=true); // DOES handle bookends, AND escapes.
	bool LoadPublicKeyFromCertFile  (const OTString & strFoldername, const OTString & strFilename); // DOES handle bookends.
    // ---------------------------------------------------------------
	bool LoadPublicKeyFromPGPKey    (const OTASCIIArmor & strKey); // does NOT handle bookends.

    // ***************************************************************
    // PUBLIC KEY
	// Get the public key in ASCII-armored format with bookends 
	// - ------- BEGIN PUBLIC KEY --------
	// Notice the "- " before the rest of the bookend starts.
	bool GetPublicKey(OTString & strKey, bool bEscaped=true) const;

	// Get the public key in ASCII-armored format
	// i2d == EVP_PKEY* converted to normal binary in RAM
	bool GetPublicKey(OTASCIIArmor & strKey) const;
	
	// Decodes a public key from ASCII armor into an actual key pointer
	// and sets that as the m_pKey on this object.
	// This is the version that will handle the bookends ( -----BEGIN PUBLIC KEY-----)
	bool SetPublicKey(const OTString & strKey, bool bEscaped=false);

	// Decodes a public key from ASCII armor into an actual key pointer
	// and sets that as the m_pKey on this object.
	bool SetPublicKey(const OTASCIIArmor & strKey);
    // ***************************************************************
    // PRIVATE KEY
	// Get the private key in ASCII-armored format with bookends 
	// - ------- BEGIN ENCRYPTED PRIVATE KEY --------
	// Notice the "- " before the rest of the bookend starts.
	bool GetPrivateKey(OTString & strKey, bool bEscaped=true) const;
    
	// Get the private key in ASCII-armored format
	bool GetPrivateKey(OTASCIIArmor & strKey) const;
	
	// Decodes a private key from ASCII armor into an actual key pointer
	// and sets that as the m_pKey on this object.
	// This is the version that will handle the bookends ( -----BEGIN ENCRYPTED PRIVATE KEY-----)
	bool SetPrivateKey(const OTString & strKey, bool bEscaped=false);
    
	// Decodes a private key from ASCII armor into an actual key pointer
	// and sets that as the m_pKey on this object.
    //
	bool SetPrivateKey(const OTASCIIArmor & strKey);
    // ***************************************************************
};









#endif // __OT_ASYMMETRIC_KEY_H__


































