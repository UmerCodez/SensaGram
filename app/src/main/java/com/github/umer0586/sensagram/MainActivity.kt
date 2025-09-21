/*
 *     This file is a part of SensaGram (https://www.github.com/UmerCodez/SensaGram)
 *     Copyright (C) 2024 Umer Farooq (umerfarooq2383@gmail.com)
 *
 *     SensaGram is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     SensaGram is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with SensaGram.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package com.github.umer0586.sensagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.github.umer0586.sensagram.ui.screens.NavScreen
import com.github.umer0586.sensagram.ui.theme.SensaGramTheme

//Todo : Add splash screen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO : enable edge to edge
        enableEdgeToEdge()
        setContent {

            // TODO : Add dark theme switch
            SensaGramTheme( darkTheme = false ) {
                NavScreen()
            }
        }

    }


}
