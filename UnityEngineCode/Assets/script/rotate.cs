using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class rotate : MonoBehaviour {

	// Use this for initialization
	public float speed = 1.0f;

	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
		
		transform.Rotate (new Vector3 (Input.GetAxis("Mouse Y"), Input.GetAxis("Mouse X"), 0) * Time.deltaTime * speed);
		
	}
}
