package com.example.smartcardemulator

import android.nfc.cardemulation.HostApduService
import android.os.Bundle
import android.util.Log
/*
font: https://github.com/PedroMooc/smartCardEmulator.git
 */
class HostCardEmulatorService: HostApduService {
    companion object{
        val TAG = "Host Card Emulator"
        val STATUS_SUCCESS = "9000"
        val STATUS_FAILED = "6F00"
        val CLA_NOT_SUPPORTED = "6E00"
        val INS_NOT_SUPPORTED = "6D00"
        val AID = "A0000002471001"
        val SELECT_INS = "A4"
        val DEFAUT_CLA = "00"
        val MIN_APDU_LENGTH = 12
    }
    override fun processCommandApdu(commandApdu: ByteArray?, extras: Bundle?): ByteArray {
        TODO("Not yet implemented")
    }

    override fun onDeactivated(reason: Int) {
        Log.d(TAG, "Deactivated: " + reason)
    }
}