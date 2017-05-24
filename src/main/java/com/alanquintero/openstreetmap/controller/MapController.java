/*******************************************************
 * Copyright (C) 2017 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "OpenLayers (with OpenStreetMap)".
 * 
 * "OpenLayers (with OpenStreetMap)" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/

package com.alanquintero.openstreetmap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alanquintero.openstreetmap.model.State;
import com.alanquintero.openstreetmap.service.StateService;

@RestController
@RequestMapping("/map")
public class MapController {

	@Autowired
	private StateService stateService;

	@RequestMapping(value = "/getStates", method = RequestMethod.GET, produces = "application/json")
	public State getStates() {
		stateService.getStates();
		return new State();
	}

}
