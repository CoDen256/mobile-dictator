package io.github.coden.dictator.alarms

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import io.github.coden.dictator.Owner
import io.github.coden.dictator.budget.BudgetService

class VpnReenableReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val service = BudgetService(context, Owner(context),"com.celzero.bravedns")
        service.enableVPN()
        service.removeAlarm()
    }
}