/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.component.ControlButton
import com.example.androiddevchallenge.ui.component.CounterDisplay

@Composable
fun TimerScreen() {
    Card(
        backgroundColor = Color.Gray,
        elevation = 6.dp,
        modifier = Modifier
            .padding(20.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.height(200.dp)
        ) {
            Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
                CounterDisplay(counter = 10)
                CounterDisplay(counter = 10)
                CounterDisplay(counter = 10)
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            )
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                ControlButton(
                    onControlClick = { },
                    id = R.drawable.ic_baseline_pause_24,
                    controlDescription = null
                )
                ControlButton(
                    onControlClick = { },
                    id = R.drawable.ic_baseline_play_arrow_24,
                    controlDescription = null
                )
                ControlButton(
                    onControlClick = { },
                    id = R.drawable.ic_baseline_refresh_24,
                    controlDescription = null
                )
            }
        }
    }
}
