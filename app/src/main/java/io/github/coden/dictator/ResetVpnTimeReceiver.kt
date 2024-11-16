package io.github.coden.dictator

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import io.github.coden.dictator.budget.BudgetService

class ResetVpnTimeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val pack = "com.celzero.bravedns"
        val service = BudgetService(context, pack)
        service.removeAlarm()
        service.resetWeeklyBudget()
    }
}