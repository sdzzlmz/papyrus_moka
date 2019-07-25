/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.moka.ui.launch;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MokaExecutionEngineSelection extends SelectionAdapter {

	protected transient MokaRunConfigurationTab launchConfigTab;

	public MokaExecutionEngineSelection(MokaRunConfigurationTab tab) {
		this.launchConfigTab = tab;
	}

	@Override
	public void widgetSelected(SelectionEvent event) {
		this.launchConfigTab.updateLaunchConfigurationDialog();
	}
}
